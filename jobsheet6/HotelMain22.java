import java.util.Scanner;
public class HotelMain22 {
    public static void main(String[] args) {
        Scanner sc22 = new Scanner(System.in);
        HotelService22 list = new HotelService22();
        Hotel22 h1 = new Hotel22("Atria", "Malang", 500000, (byte)2);
        Hotel22 h2 = new Hotel22("Ijen Suites", "Malang", 1000000, (byte)4);
        Hotel22 h3 = new Hotel22("101 Hotel", "Malang", 750000, (byte)3);
        Hotel22 h4 = new Hotel22("Kartika", "Malang", 450000, (byte)1);
        Hotel22 h5 = new Hotel22("Santika", "Malang", 3000000, (byte)5);

        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);

        int pilih;
        System.out.println("================================");
        System.out.println("              SORTING           ");
        System.out.println("================================");
        System.out.println("1. Tampilkan Hotel         ");
        System.out.println("2. Bubble Sort    (Harga)  ");
        System.out.println("3. Bubble Sort    (Bintang)");
        System.out.println("4. Selection Sort (Harga)  ");
        System.out.println("5. Selection Sort (Bintang)");
        System.out.print("Pilih (1-5) : ");
        pilih = sc22.nextInt();
        switch(pilih){
            case 1 :
            System.out.println("Data Hotel = ");
            list.tampil();
            break;

            case 2:
            System.out.println("Data hotel setelah sorting desc berdasarkan harga = ");
            list.bubbleSortHarga();
            list.tampil();
            break;

            case 3 :
            System.out.println("Data mahaiswa setelah sorting asc berdasarkan bintang = ");
            list.bubbleSortBintang();
            list.tampil();
            break;

            case 4 :
            System.out.println("Data mahaiswa setelah sorting asc berdasarkan harga = ");
            list.selectionSortHarga();
            list.tampil();
            break;

            case 5 :
            System.out.println("Data mahaiswa setelah sorting asc berdasarkan bintang = ");
            list.selectionSortBintang();
            list.tampil();
            break;

            default :
            System.out.println("Pilihan tidak valid");
            System.exit(0);
        }
    }
}
