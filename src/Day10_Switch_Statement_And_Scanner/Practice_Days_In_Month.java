package Day10_Switch_Statement_And_Scanner;

public class Practice_Days_In_Month {
    public static void main(String[] args) {
        byte num=18;
        boolean days28=num==2;
        boolean days30=num==4 && num==6 && num==9 && num==11;
        //pre condition here is num>0 && num <13)
        String result=" ";
        if (num>0 && num<13){
            result=(days28)? " 28 Days":(days30)? "30 Days":"31 Days";

        }else {
            result="Invalid";
        }
        System.out.println(result);



    }
}
