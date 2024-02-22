
public class HPMain22 {
    public static void main(String[] args) {
        HP22 phone1 = new HP22(null, null, 0);
        phone1.merk = "Samsung";
        phone1.tipe = "S23 Ultra";
        phone1.ukuranLayar = 6.8f;
        phone1.tampilInformasi();
        phone1.cekKondisi(false);
        HP22 phone2 = new HP22("iPhone","15 Plus",6.69f);
    }
}
