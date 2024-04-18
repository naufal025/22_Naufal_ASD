public class Service22 {
    Rekening22 list [] = new Rekening22[19];
    Transaksi22 list2 [] = new Transaksi22[19];
    int idx1, idx2;
    void tambah1 (Rekening22 M){
        if (idx1<list.length){
            list[idx1] = M;
            idx1++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }
    void tambah2 (Transaksi22 T){
        if (idx2<list2.length){
            list2[idx2] = T;
            idx2++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil(){
        System.out.printf("%-15s%-20s%-20s%-15s%-25s%n", "No Rekening", "Nama", "Nama Ibu", "Phone", "Email");
        for(Rekening22 M : list){
            M.tampilkanData();
        }
    }

    void tampil2(){
        System.out.printf("%-20s%-15s%-20s%-20s%-15s%-25s%n", "No Rekening","saldo", "saldoAwal", "saldoAkhir", "tanggalTransaksi", "type");
        for(Transaksi22 T : list2){
            T.tampilkanDataSaldo();
        }
    }

    void tampilkanSaldoDiatas500000() {
        System.out.println("Daftar No Rekening dengan Saldo di atas 500000:");
        System.out.println("-------------------------------------------------------------------------------");
        for (Transaksi22 T : list2) {
            if (T.saldoAkhir > 500000) {
                System.out.printf("%-15s%-15.2f%n", T.noRekening, T.saldoAkhir);
            }
        }
    }

    void sortingName() {
        for (int i = 0; i < idx1 - 1; i++) {
            for (int j = 0; j < idx1 -i -1; j++) {
                if (list[j].nama.compareToIgnoreCase(list[j + 1].nama) > 0   ) {
                    Rekening22 temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }
}
