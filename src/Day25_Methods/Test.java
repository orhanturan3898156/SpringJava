package Day25_Methods;

import Resources.Library;
public class Test {
    public static void main(String[] args) {
        String str="ABCDABABABAAB";
        String result=Library.removeDuplicate(str);
        System.out.println(result);

        String str1="ABABB";
        String str2="B";
        int num1=Library.frequency(str1,str2);
        System.out.println(num1);


        String str3="AAABBCCCCC";
        String result3=Library.frequencyOfChar(str3);
        System.out.println(result3);






    }
}
