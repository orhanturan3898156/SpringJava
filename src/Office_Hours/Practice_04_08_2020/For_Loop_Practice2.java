package Office_Hours.Practice_04_08_2020;

public class For_Loop_Practice2 {
    public static void main(String[] args) {


        for (int i=0;i<=100;i++){
            if (i%3==0 || i%5==0){
                System.out.print(i+" ");
            }
        }

        System.out.println("\n=====================\n");

        String word="Orhan";

        String reversed="";


        for (int i=word.length()-1;i>=0;i--){
            reversed+=word.charAt(i);

            //reversed+=word.substring(i,i+1);

        }
        System.out.println(reversed);

        if (reversed.equalsIgnoreCase(word)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not");
        }





    }
}
