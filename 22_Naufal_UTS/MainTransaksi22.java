import java.util.Scanner;
public class MainTransaksi22 {
    public static void main(String[] args) {
        Scanner sc22 = new Scanner(System.in);
        Service22 list = new Service22();
        Rekening22 r1 = new Rekening22("16030927 3084","Wallace","Chase Castro","1-458-264-3263","ligula.Nullam@tacitisociosqu.edu");
        Rekening22 r2 = new Rekening22("16100617 0573","Darius","Julian Daniel","1-357-843-0547","nec@lectusjusto.org");
        Rekening22 r3 = new Rekening22("16240401 2243","Fuller","Finn Dunlap","571-7062","convallis@Vestibulumanteipsum.org");
        Rekening22 r4 = new Rekening22("16270525 0112","Malcolm","Keane Floyd","623-0234","porttitor.tellus.non@Curabitur.ca");
        Rekening22 r5 = new Rekening22("16971204 2416","Geoffrey","Stephen Pratt","1-683-416-8323","ut.pellentesque@luctusutpellentesque.com");
        Rekening22 r6 = new Rekening22("16100727 8862","Rudyard","Charles Morales","650-5379","Proin.eget@velitegestaslacinia.ca");
        Rekening22 r7 = new Rekening22("16460329 4259","Troy","Damon Guerra","897-7608","pede.Suspendisse.dui@a.ca");
        Rekening22 r8 = new Rekening22("16320421 3437","Alec","Cooper Lee","792-4447","non@mus.com");
        Rekening22 r9 = new Rekening22("16180729 7229","Walter","Seth Drake","863-8209","Pellentesque.ut.ipsum@neque.ca");
        Rekening22 r10 = new Rekening22("16950313 6823","Simon","Burton Gates","592-6919","tellus.justo.sit@commodoauctor.net");
        Rekening22 r11 = new Rekening22("16850708 3528","Kamal","Odysseus Salas","1-115-339-7678","dictum@nec.edu");
        Rekening22 r12 = new Rekening22("16080205 9329","Xenos","Colin Curry","1-891-703-2664","vel@ullamcorpermagna.co.uk");
        Rekening22 r13 = new Rekening22("16080628 2695","Merritt","Clarke Roman","1-978-632-5110","Aliquam.gravida@vestibulumMauris.net");
        Rekening22 r14 = new Rekening22("16130909 2979","Ryder","Joel Cunningham","817-1766","interdum.Curabitur.dictum@rutrumurna.edu");
        Rekening22 r15 = new Rekening22("16890212 8688","Preston","Brock Schroeder","1-675-400-4501","et.ultrices@a.co.uk");
        Rekening22 r16 = new Rekening22("16141008 9963","Alec","Baker Barton","527-9085","ut@aultriciesadipiscing.ca");
        Rekening22 r17 = new Rekening22("16511222 7763","Price","Ashton Burke","1-564-419-4285","Proin.velit@Duisac.net");
        Rekening22 r18 = new Rekening22("16720623 0943","Devin","Slade Flores","977-6690","ac@nibhAliquamornare.com");
        Rekening22 r19 = new Rekening22("16771126 7372","Ignatius","Lionel Kane","353-5137","cubilia.Curae.Phasellus@Duis.com");

        list.tambah1(r1);
        list.tambah1(r2);
        list.tambah1(r3);
        list.tambah1(r4);
        list.tambah1(r5);
        list.tambah1(r6);
        list.tambah1(r7);
        list.tambah1(r8);
        list.tambah1(r9);
        list.tambah1(r10);
        list.tambah1(r11);
        list.tambah1(r12);
        list.tambah1(r13);
        list.tambah1(r14);
        list.tambah1(r15);
        list.tambah1(r16);
        list.tambah1(r17);
        list.tambah1(r18);
        list.tambah1(r19);

        Service22 list2 = new Service22();
        Transaksi22 s1 = new Transaksi22( r1,898214.0,494048.0,3587.0,"2021-03-09 07:54:42","");
        Transaksi22 s2 = new Transaksi22( r2, 205420.0,200162.0,775880.0,"2021-06-25 10:23:00","");
        Transaksi22 s3 = new Transaksi22( r3, 838632.0,350929.0,328316.0,"2021-09-18 23:00:04","");
        Transaksi22 s4 = new Transaksi22(r4,230659.0,204434.0,690503.0,"2022-02-02 19:10:34","");
        Transaksi22 s5 = new Transaksi22(r5,770592.0,334245.0,444267.0,"2020-08-11 13:36:56","");
        Transaksi22 s6 = new Transaksi22(r6,685302.0,451002.0,376442.0,"2020-05-23 07:34:53","");
        Transaksi22 s7 = new Transaksi22(r7,816129.0,851403.0,597842.0,"2021-07-18 19:41:20","");
        Transaksi22 s8 = new Transaksi22(r8,989609.0,333823.0,802752.0,"2022-02-01 01:13:11","");
        Transaksi22 s9 = new Transaksi22(r9,297103.0,396116.0,779589.0,"2021-07-03 01:09:49","");
        Transaksi22 s10 = new Transaksi22(r10,66190.0,259150.0,619774.0,"2021-09-09 03:57:30","");
        Transaksi22 s11 = new Transaksi22(r11,234301.0,278309.0,547922.0,"2021-08-24 13:18:39","");
        Transaksi22 s12 = new Transaksi22(r12,243306.0,869468.0,50283.0,"2021-03-12 03:40:16","");
        Transaksi22 s13 = new Transaksi22(r13,371045.0,991242.0,602034.0,"2021-08-06 11:48:59","");
        Transaksi22 s14 = new Transaksi22(r14,395170.0,97058.0,472273.0,"2021-05-02 10:53:31","");
        Transaksi22 s15 = new Transaksi22(r15,862731.0,561908.0,109431.0,"2021-07-31 08:11:00","");
        Transaksi22 s16 = new Transaksi22(r16,556798.0,31387.0,725426.0,"2021-03-27 06:18:20","");
        Transaksi22 s17 = new Transaksi22(r17,873982.0,896213.0,846142.0,"2021-07-18 04:06:30","");
        Transaksi22 s18 = new Transaksi22(r18,774247.0,739406.0,775848.0,"2020-10-24 01:39:00","");
        Transaksi22 s19 = new Transaksi22(r19,66987.0,823014.0,868772.0,"2020-12-21 05:57:59","");
        list2.tambah2(s1);
        list2.tambah2(s2);
        list2.tambah2(s3);
        list2.tambah2(s4);
        list2.tambah2(s5);
        list2.tambah2(s6);
        list2.tambah2(s7);
        list2.tambah2(s8);
        list2.tambah2(s9);
        list2.tambah2(s10);
        list2.tambah2(s11);
        list2.tambah2(s12);
        list2.tambah2(s13);
        list2.tambah2(s14);
        list2.tambah2(s15);
        list2.tambah2(s16);
        list2.tambah2(s17);
        list2.tambah2(s18);
        list2.tambah2(s19);

        int pilih;
        System.out.println("================================");
        System.out.println("               UTS               ");
        System.out.println("================================");
        System.out.println("1. Tampil Data rekening         ");
        System.out.println("2. Tampil Data transaksi        ");
        System.out.println("3. Mencari saldo > 500000       ");
        System.out.println("4. Sorting by name              ");
        System.out.println("5. Keluar                       ");
        System.out.print("Pilih (1-5) : ");
        pilih = sc22.nextInt();
        switch(pilih){
            case 1 :
            list.tampil();
            break;
            case 2 :
            list2.tampil2();
            break;
            case 3 :
            list2.tampilkanSaldoDiatas500000();
            break;
            case 4 :
            list.sortingName();
            list.tampil();
            break;
            case 5 :
            System.out.println("Terimakasih telah menggunakan bank naufal!!");
            System.exit(0);
            default :
            System.out.println("Pilihan tidak valid!!");
            System.exit(0);
    }
}
}
