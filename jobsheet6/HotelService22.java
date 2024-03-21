public class HotelService22 {
    Hotel22 rooms [] = new Hotel22[5];
    int idx;

    void tambah (Hotel22 H){
        if (idx<rooms.length){
            rooms[idx] = H;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil(){
        for(Hotel22 H : rooms){
            H.tampil();
            System.out.println("------------------------");
        }
    }
    void bubbleSortHarga(){
        for(int i = 0 ; i < rooms.length-1;i++){
            for (int j = 1; j < rooms.length-i; j++){
                if(rooms[j].harga > rooms[j-1].harga){
                    Hotel22 tmp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = tmp;
                }
            }
        }
    }
    void selectionSortHarga(){
        for(int i = 0; i < rooms.length-1; i++){
            int idxMin = i;
            for(int j=i+1; j < rooms.length; j++){
                if(rooms[j].harga < rooms[idxMin].harga){
                    idxMin = j;
                }
            }
            //swap
            Hotel22 tmp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = tmp;
        }
    }
    
    void bubbleSortBintang(){
        for(int i = 0 ; i < rooms.length-1;i++){
            for (int j = 1; j < rooms.length-i; j++){
                if(rooms[j].bintang > rooms[j-1].bintang){
                    Hotel22 tmp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = tmp;
                }
            }
        }
    }

    void selectionSortBintang(){
        for(int i = 0; i < rooms.length-1; i++){
            int idxMin = i;
            for(int j=i+1; j < rooms.length; j++){
                if(rooms[j].bintang < rooms[idxMin].bintang){
                    idxMin = j;
                }
            }
            //swap
            Hotel22 tmp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = tmp;
        }
    }
}
