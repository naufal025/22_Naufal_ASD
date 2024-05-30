package Tugas;

import java.util.Scanner;

public class Queue {
    private Node head;
    private Node tail;
    private int size;

    public Queue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void enqueue(String noAntrian, String nama) {
        Node newNode = new Node(noAntrian, nama);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
        System.out.println(nama + " dengan nomor antrian " + noAntrian + " telah ditambahkan.");
    }

    public void dequeue() {
        if (head == null) {
            System.out.println("Tidak ada data pengantre vaksin.");
            return;
        }
        Node removedNode = head;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        size--;
        System.out.println(removedNode.nama + " telah selesai divaksinasi.");
        display();
    }

    public void display() {
        if (head == null) {
            System.out.println("Tidak ada data pengantre vaksin.");
            return;
        }
        Node current = head;
        System.out.println("Daftar Penerima Vaksin:");
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("|No.    |Nama                |");
        System.out.println("++++++++++++++++++++++++++++++");
        while (current != null) {
            System.out.printf("|%-7s|%-20s|\n", current.noAntrian, current.nama);
            current = current.next;
        }
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("Sisa Antrian: " + size);
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n++++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Nomor Antrian: ");
                    String noAntrian = scanner.nextLine();
                    System.out.print("Masukkan Nama Penerima: ");
                    String nama = scanner.nextLine();
                    enqueue(noAntrian, nama);
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
