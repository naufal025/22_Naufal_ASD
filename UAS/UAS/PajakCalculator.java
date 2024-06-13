package UAS;

public class PajakCalculator {
    public static long hitungPajak(Kendaraan kendaraan) {
        String jenis = kendaraan.getJenis();
        int cc = kendaraan.getCc();
        long pajak = 0;

        if (jenis.equals("Motor")) {
            if (cc < 100) {
                pajak = 100000;
            } else if (cc <= 250) {
                pajak = 250000;
            } else {
                pajak = 500000;
            }
        } else if (jenis.equals("Mobil")) {
            if (cc < 1000) {
                pajak = 750000;
            } else if (cc <= 2500) {
                pajak = 1000000;
            } else {
                pajak = 1500000;
            }
        }

        return pajak;
    }

    public static long hitungDenda(Kendaraan kendaraan, int bulanBayar) {
        int bulanHarusBayar = kendaraan.getBulanHarusBayar();
        int selisihBulan = bulanBayar - bulanHarusBayar;
        long denda = 0;

        if (selisihBulan > 0) {
            if (selisihBulan <= 3) {
                denda = 50000;
            } else {
                denda = 50000 * selisihBulan;
            }
        }

        return denda;
    }
}
