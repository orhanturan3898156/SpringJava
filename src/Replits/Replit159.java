package Replits;

public class Replit159 {
    public static void main(String[] args) {

        int bprice=120;
        int sprice=150;

        String result=cProfit(sprice,bprice);
        System.out.println(result);



    }
    public static String cProfit(int sellprice,int buyprice){
        String result="";
        if (sellprice>buyprice){
            result="profit";
        }else if (buyprice>sellprice){

            result="loss";
        }else {
            result="no profit or loss";

        }



        return result;
    }
}
