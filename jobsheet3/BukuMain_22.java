import java.util.Scanner;
public class BukuMain_22 {
    public static void main(String[] args) {
        Scanner sc22 = new Scanner (System.in);

        System.out.print("Masukkan jumlah data buku : ");
        int input = sc22.nextInt();

        Buku_22 [] arrayOfBuku_22 = new Buku_22[input];
        String nama,penulis,penerbit,kategori;
        int jml_hal;

        for (int i = 0; i < input; i++){
            System.out.println("********************************");
            System.out.println("Buku ke - " + (i+1));
            System.out.print("Masukkan nama buku            : ");
            nama = sc22.next();
            System.out.print("Masukkan penulis buku         : ");
            penulis = sc22.next();
            System.out.print("Masukkan penerbit buku        : ");
            penerbit = sc22.next();
            System.out.print("Masukkan jumlah halaman buku  : ");
            jml_hal = sc22.nextInt();
            System.out.print("Masukkan kategori buku        : ");
            kategori = sc22.next();
            System.out.println();
            System.out.println("********************************");

            arrayOfBuku_22[i] = new Buku_22(nama,penulis,penerbit,jml_hal,kategori);

        }

        for (int j = 0; j < input; j++){
            arrayOfBuku_22[j].cetakInfo();
        }
    }
}