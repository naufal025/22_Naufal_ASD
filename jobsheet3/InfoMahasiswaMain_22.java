import java.util.Scanner;

public class InfoMahasiswaMain_22 {
    public static void main(String[] args) {
        Scanner sc22 = new Scanner(System.in);
        double ipk;
        System.out.print("Masukkan jumlah Mahasiswa : ");
        int input = sc22.nextInt();
        double totalIpk = 0; 

        InfoMahasiswa_22[] arrayInfoMahasiswa22 = new InfoMahasiswa_22[input];

        for (int i = 0; i < arrayInfoMahasiswa22.length; i++) {
            System.out.println("=======================================");
            System.out.println("Masukkan data mahasiswa ke - " + (i+1));
            System.out.print("Masukkan nama                 : ");
            String nama = sc22.next();
            System.out.print("Masukkan NIM                  : ");
            int nim = sc22.nextInt();
            System.out.print("Masukkan jenis kelamin (l/p)  : ");
            String jk = sc22.next();    
            System.out.print("Masukkan IPK                  : ");
            ipk = sc22.nextDouble();
            System.out.println("=======================================");
           

            arrayInfoMahasiswa22[i] = new InfoMahasiswa_22(nama, nim, jk, ipk);
            totalIpk += ipk;
        }
        int index = 0;
        for (InfoMahasiswa_22 mahasiswa : arrayInfoMahasiswa22) {
            mahasiswa.cetak(index);
            index++;
        }
        if (input != 0) {
            double avgipk = totalIpk/input;
            System.out.println("------------------------------------");
            System.out.println("Rata rata IPK               : " + avgipk);
            System.out.println("------------------------------------");
        } else {
            System.out.println("Tidak ada mahasiswa!");
        }
    }
}
