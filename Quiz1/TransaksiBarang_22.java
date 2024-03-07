import java.util.Scanner;

public class TransaksiBarang_22{
    public Barang_22 [] barangs = new Barang_22[100];
    public Barang_22 [] pembelians = new Barang_22[100];
    public int jumlahBarang;
    public int jumlahPembelian;

    public TransaksiBarang_22(){
        barangs[jumlahBarang++] = new Barang_22("K01", "Sabun", 1000, 5);
        barangs[jumlahBarang++] = new Barang_22("K02", "Pasta Gigi", 2000, 10);
        barangs[jumlahBarang++] = new Barang_22("K03", "Biore", 3000, 23);
        barangs[jumlahBarang++] = new Barang_22("K04", "Shampoo", 4000, 55);
        barangs[jumlahBarang++] = new Barang_22("K05", "Sikat Gigi", 5000, 65);
    }
    public void tampilkanBarang() {
        System.out.println("=========================");
        System.out.println("     Daftar Barang       ");
        System.out.println("=========================");
        System.out.printf("%-10s%-20s%-15s%-10s%n", "Kode", "Nama", "Harga", "Stok");
        for (int i = 0; i < jumlahBarang; i++) {
            Barang_22 barang = barangs[i];
            System.out.printf("%-10s%-20s%-15.2f%-10d%n", barang.getKode(), barang.getNama(), barang.getHarga(), barang.getStok());
        }
    System.out.println();
    }
    public void tampilkanBarangPembelian() {
        System.out.println("=========================");
        System.out.println("     Daftar Pembelian    ");
        System.out.println("=========================");
        System.out.printf("%-10s%-20s%-15s%n", "Kode", "Nama", "Harga");
        for (int i = 0; i < jumlahPembelian; i++) {
            Barang_22 barang = pembelians[i];
            System.out.printf("%-10s%-20s%-15.2f%n", barang.getKode(), barang.getNama(), barang.getHarga());
        }
    System.out.println();
    }
    public void melakukanPembelian() {
        Scanner sc22 = new Scanner(System.in);
        TransaksiBarang_22 transaksiBarang = new TransaksiBarang_22();
        transaksiBarang.tampilkanBarang();
        System.out.print("Masukkan kode barang: ");
        String kodeBarang = sc22.nextLine();

        Barang_22 barangDibeli = null;
        for (int i = 0; i < jumlahBarang; i++) {
            Barang_22 barang = barangs[i];
            if (barang.getKode().equals(kodeBarang)) {
                barangDibeli = barang;
                break;
            }
        }

        if (barangDibeli != null && barangDibeli.getStok() > 0) {
            pembelians[jumlahPembelian++] = barangDibeli;
            barangDibeli.setStok(barangDibeli.getStok() - 1);
            System.out.println("Pembelian berhasil!");
            System.out.print("Apakah akan belanja kembali(Y/N)? ");
            String pilih = sc22.nextLine();
            if (pilih.equalsIgnoreCase("y")) {
                melakukanPembelian();
            } else {
                System.out.println("Terima Kasih!");
            }
        } else {
            System.out.println("Barang tidak ditemukan atau stok habis.");
        }
        System.out.println();
    }
}

