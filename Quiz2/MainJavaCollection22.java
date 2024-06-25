import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainJavaCollection22 {
    public static void main(String[] args) {
        ArrayList<MahasiswaJavaCollection22> arrayList = new ArrayList<>();
        arrayList.add(new MahasiswaJavaCollection22("001", "Alice", "01-01-2000"));
        arrayList.add(new MahasiswaJavaCollection22("002", "Bob", "02-02-2001"));
        arrayList.add(new MahasiswaJavaCollection22("003", "Charlie", "03-03-2002"));
        arrayList.add(new MahasiswaJavaCollection22("004", "David", "04-04-2003"));

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Cari Mahasiswa");
            System.out.println("4. Cetak Semua Mahasiswa");
            System.out.println("5. Urutkan Mahasiswa berdasarkan NIM");
            System.out.println("6. Keluar");
            System.out.print("Pilih: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Tanggal Lahir: ");
                    String tglLahir = scanner.nextLine();
                    arrayList.add(new MahasiswaJavaCollection22(nim, nama, tglLahir));
                    break;
                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    nim = scanner.nextLine();
                    arrayList.removeIf(mhs -> mhs.nim.equals(nim));
                    break;
                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
                    nim = scanner.nextLine();
                    boolean found = false;
                    for (MahasiswaJavaCollection22 mhs : arrayList) {
                        if (mhs.nim.equals(nim)) {
                            System.out.println("Mahasiswa ditemukan: " + mhs);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    }
                    break;
                case 4:
                    printTable(arrayList);
                    break;
                case 5:
                    Collections.sort(arrayList, new Comparator<MahasiswaJavaCollection22>() {
                        @Override
                        public int compare(MahasiswaJavaCollection22 m1, MahasiswaJavaCollection22 m2) {
                            return m1.nim.compareTo(m2.nim);
                        }
                    });
                    System.out.println("Mahasiswa telah diurutkan.");
                    printTable(arrayList);
                    break;
                case 6:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 6);

        scanner.close();
    }

    public static void printTable(ArrayList<MahasiswaJavaCollection22> list) {
        System.out.println("+------+----------------+--------------+");
        System.out.println("| NIM  | Nama           | Tgl Lahir    |");
        System.out.println("+------+----------------+--------------+");
        for (MahasiswaJavaCollection22 mhs : list) {
            System.out.format("| %-4s | %-14s | %-12s |%n", mhs.nim, mhs.nama, mhs.tglLahir);
        }
        System.out.println("+------+----------------+--------------+");
    }
}
