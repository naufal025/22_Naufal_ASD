import java.util.Scanner;
public class CanteenDemo22 {
    public static void main(String[] args) {
        Scanner sc22 = new Scanner(System.in);
        Item22 [] items = new Item22[5];

        for (int i = 0; i < items.length; i++){
            items [i] = new Item22();
            System.out.println("==========================");
            System.out.print("Masukkan nama item ke - "+(i+1)+"   : ");
            items[i].name = sc22.nextLine();
            System.out.print("Masukkan harga item ke - "+(i+1)+"  : ");
            items[i].price = sc22.nextDouble();
            System.out.print("Masukkan stok item ke - "+(i+1)+"   : ");
            items[i].stok = sc22.nextInt();
            System.out.println("==========================");
            sc22.nextLine();
        }

        for (int j = 0; j < items.length; j++){
            items[j].displayInfo();
        }

        }
    }

    //inisialisasi manual
    /*Item22 item1 = new Item22("Nasi Goreng", 15000, 10);
        Item22 item2 = new Item22("Donat Gula", 3000, 20);
        Item22 item3 = new Item22("Cimory", 7000, 15);
        Item22[] items = new Item22[3];
        items[0] = item1;
        items[1] = item2;
        items[2] = item3;
        for(int i = 0; i < items.length; i++){
            items[i].displayInfo();*/

