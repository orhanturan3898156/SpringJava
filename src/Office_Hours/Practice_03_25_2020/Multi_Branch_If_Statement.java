package Office_Hours.Practice_03_25_2020;

public class Multi_Branch_If_Statement {
    public static void main(String[] args) {
        int num=9;
        String result="";
        if (num>0){
            result="Positive";
        }else if (num<0){
            result="Negative";
        }else {
            result="Zero";
        }
        System.out.println(result);

        System.out.println("==============================");

        String browsername="Chrome";
        if (browsername=="Firefox"){
            System.out.println("Firebox is opening");
        }else if (browsername=="Chrome"){
            System.out.println("Chrome is opening");

        }else if (browsername=="Internet Explorer"){
            System.out.println("IE is opening");
        }else if (browsername=="safari"){
            System.out.println("Safari is opening");
        }else if (browsername=="Opera"){
            System.out.println("Opera is opening");
        }else {
            System.out.println("Invalid browser");
        }

    }

}
