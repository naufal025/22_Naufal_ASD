import java.util.Scanner;
public class PersegiPanjangDemo_22 {
    public static void main(String[] args) {
        Scanner sc22 = new Scanner (System.in);

        System.out.print("Masukkan banyak persegi panjang yang anda inginkan : ");
        int length = sc22.nextInt();
        
        PersegiPanjang_22 [] arrayOfPersegiPanjang_22 = new PersegiPanjang_22[length];
        int panjang , lebar;
    
        for (int i = 0; i < length; i++){
            System.out.println("Persegi panjang ke - " + (i+1));
            System.out.print("Masukkan panjang : ");
            panjang = sc22.nextInt();
            System.out.print("Masukkan lebar   : ");
            lebar = sc22.nextInt();

            arrayOfPersegiPanjang_22[i] = new PersegiPanjang_22(panjang,lebar);
        }

       for (int j = 0; j < length; j++) {
        arrayOfPersegiPanjang_22[j].cetakInfo();
        arrayOfPersegiPanjang_22[j].hitungLuas();
        arrayOfPersegiPanjang_22[j].hitungKeliling();

       }
       
}
}

      //inisialisasi manual
      /*arrayOfPersegiPanjang_22[0] = new PersegiPanjang_22();
        arrayOfPersegiPanjang_22[0].panjang = 110;
        arrayOfPersegiPanjang_22[0].lebar = 30;

        arrayOfPersegiPanjang_22[1] = new PersegiPanjang_22();
        arrayOfPersegiPanjang_22[1].panjang = 80;
        arrayOfPersegiPanjang_22[1].lebar = 40;

        arrayOfPersegiPanjang_22[2] = new PersegiPanjang_22();
        arrayOfPersegiPanjang_22[2].panjang = 100;
        arrayOfPersegiPanjang_22[2].lebar = 20;

        System.out.println("Persegi panjang ke-1, panjang : " +arrayOfPersegiPanjang_22[0].panjang 
        + " , lebar : " +arrayOfPersegiPanjang_22[0].lebar);
        System.out.println("Persegi panjang ke-2, panjang : " +arrayOfPersegiPanjang_22[1].panjang 
        + " , lebar : " +arrayOfPersegiPanjang_22[1].lebar);
        System.out.println("Persegi panjang ke-3, panjang : " +arrayOfPersegiPanjang_22[2].panjang 
        + " , lebar : " +arrayOfPersegiPanjang_22[2].lebar);*/

        /*for (int i = 0; i < 3; i++){
            System.out.println("Persegi panjang ke - " +(i+1)+" , panjang : " + arrayOfPersegiPanjang_22[i].panjang + 
            ", lebar : " +arrayOfPersegiPanjang_22[i].lebar );
        }*/
        