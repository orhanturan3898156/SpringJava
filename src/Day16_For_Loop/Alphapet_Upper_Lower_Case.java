package Day16_For_Loop;

public class Alphapet_Upper_Lower_Case {
    public static void main(String[] args) {

        String uppercase="";
        String lowercase="";

        for (char ch='A';ch<='Z';ch++){
            uppercase+=ch;
        }
        System.out.println(uppercase);

        for (char ch='a';ch<='z';ch++){
            lowercase+=ch;
        }
        System.out.println(lowercase);

        String result="";

        for (int i=0; i<=uppercase.length()-1;i++){
            result+=uppercase.charAt(i)+""+lowercase.charAt(i) +" ";

        }
        System.out.println(result);

    }
}
