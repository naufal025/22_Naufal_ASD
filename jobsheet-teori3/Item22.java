public class Item22 {
    public String name;
    public double price;
    public int stok;

    public Item22(){

    }

    public Item22(String ItemName, double itemPrice, int itemStok){
        name = ItemName;
        price = itemPrice;
        stok = itemStok;
    }
    
    public void displayInfo(){
        System.out.println("-----------------------------------");
        System.out.println("Name item                 : " + name);
        System.out.println("Price                     : " + price);
        System.out.println("Stok                      : " + stok);
        System.out.println("-----------------------------------");
    }
}