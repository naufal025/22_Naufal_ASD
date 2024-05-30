package Tugas;

public class Node {
    String noAntrian;
    String nama;
    Node next;
    Node prev;

    public Node(String noAntrian, String nama) {
        this.noAntrian = noAntrian;
        this.nama = nama;
        this.next = null;
        this.prev = null;
    }
}
