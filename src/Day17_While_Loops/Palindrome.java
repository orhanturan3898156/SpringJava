package Day17_While_Loops;


public class Palindrome {
    public static void main(String[] args) {
        String str="Java";
        String reservestr="";

        int index=str.length()-1;

        while (index>=0){

            reservestr+=str.charAt(index);
            index--;
        }
        System.out.println(reservestr);

        boolean palindrome=reservestr.equalsIgnoreCase(str);
        System.out.println(palindrome);

        if (palindrome){
            System.out.println("Palindrome");

        }      else {
            System.out.println("Not");
        }

    }
}
