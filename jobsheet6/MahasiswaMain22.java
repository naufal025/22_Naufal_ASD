public class MahasiswaMain22 {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi22 list = new DaftarMahasiswaBerprestasi22();
        Mahasiswa22 m1 = new Mahasiswa22("icha", 2023, 18, 4);
        Mahasiswa22 m2 = new Mahasiswa22("pres", 2022, 20, 3.5);
        Mahasiswa22 m3 = new Mahasiswa22("sinyo", 2022, 20, 3);
        Mahasiswa22 m4 = new Mahasiswa22("paiss", 2019, 25, 3.2);
        Mahasiswa22 m5 = new Mahasiswa22("alpin", 2023, 18, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("Data mahaiswa setelah sorting desc berdasarkan ipk = ");
        list.insertionSort();
        list.tampil();
    }
}
