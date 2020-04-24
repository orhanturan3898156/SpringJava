package Day15_For_Loop;


public class Reverse_String {
    public static void main(String[] args) {
        String str="Java";

        String reverse="";
        int lastindex=str.length()-1;
        String result="";

        for (int i=lastindex;i>=0;i--){
            //System.out.print(str.charAt(i));
            result+=str.charAt(i);
        }
        System.out.println(result);

        System.out.println("========================");

        String word="Bukalemun";

        int lastindex2=word.length()-1;

        String result2="";
        for (int i=lastindex2;i>=0;i--){
            result2+=word.charAt(i);
        }
        System.out.println(result2);


    }
}
