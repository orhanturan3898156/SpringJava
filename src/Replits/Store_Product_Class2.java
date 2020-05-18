package Replits;

public class Store_Product_Class2 {
    String label;
    int price;
    String category="misc";
    boolean hasExpiration;
    int stock=0;

    public Store_Product_Class2(){

    }
    public Store_Product_Class2(String label,int price, int stock){
        this.label=label;
        this.price=price;
        this.stock=stock;
        category="misc";
        hasExpiration=false;
    }
    public Store_Product_Class2(String label,int price){
        this.label=label;
        this.price=price;

        hasExpiration=false;

    }
    public Store_Product_Class2(String label,int price,String category,boolean hasExpiration){
        this.label=label;
        this.price=price;
        this.category=category;
        hasExpiration=hasExpiration;
      
    }
    public void expired(boolean hasExpiration){

        if (hasExpiration){
            stock=0;
        }
    }
    public boolean sale(int quantity){
        if (stock>=quantity){
            stock-=quantity;
            return true;
        }  else {
            return hasExpiration;
        }

    }
    public double getDiscountedPrice(double discount){
      if (discount<1 && discount>0){
            return price*(1-discount);
      }
      else {
          return price;
      }
    }


    public String toString() {
        return
                "label= " + label  +
                        ", price= " + price +
                        ", category= " + category +
                        ", hasExpriration= " + hasExpiration +
                        ", stock= " + stock
                ;
    }

    public static void main(String[] args) {
        Store_Product_Class2 item1=new Store_Product_Class2();
        System.out.println(item1);

        Store_Product_Class2 item2=new Store_Product_Class2("bread",3);
        System.out.println(item2);

        Store_Product_Class2 item3=new Store_Product_Class2("bread",3,"misc",false);
        System.out.println(item3.getDiscountedPrice(0.3));


    }

}
