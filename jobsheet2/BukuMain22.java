public class BukuMain22 {
    public static void main(String[] args) {
        Buku22 bk22 = new Buku22();
        bk22.judul = "Today Ends Tomorrow Comes";
        bk22.pengarang = "Denanda Pratiwi";
        bk22.halaman = 198;
        bk22.stok = 13;
        bk22.harga = 71000;

        bk22.tampilInformasi();
        bk22.terjual(5);
        bk22.gantiHarga(60000);
        bk22.tampilInformasi();

        Buku22 bk2Buku22 = new Buku22("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2Buku22.terjual(11);
        bk2Buku22.tampilInformasi();

       int jumlahBukuTerjual = 5;
       double hargaFinal = bk22.finalHarga(jumlahBukuTerjual);
       System.out.println("Harga setelah diskon: Rp. " + hargaFinal);
    }
}