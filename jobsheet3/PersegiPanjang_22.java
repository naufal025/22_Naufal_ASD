public class PersegiPanjang_22{
    public int panjang;
    public int lebar;
    
public PersegiPanjang_22(int p, int l){
    panjang = p;
    lebar = l;
        }
public PersegiPanjang_22(){

}
    void hitungLuas() {
        int luas = panjang * lebar;
        System.out.println("Luas                    : "+luas);
    }
    void hitungKeliling() {
        int keliling = 2 * (panjang + lebar);
        System.out.println("keliling                : "+keliling);
    }

    public void cetakInfo(){
        System.out.println("-----------------------------------");
        System.out.println("Panjang                   : " + panjang);
        System.out.println("Lebar                     : " + lebar);
        System.out.println("-----------------------------------");
        }
    }
    
