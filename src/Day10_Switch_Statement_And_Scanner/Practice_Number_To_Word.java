package Day10_Switch_Statement_And_Scanner;

public class Practice_Number_To_Word {
    public static void main(String[] args) {
        int num=-9;
        String word=" ";
        if (num>=0){

        }
        word=(num>0)?"Positive":(num==0)? "zero":"not valid"; //eger olumsuz kosuluda ternary ile yapmak istiyosan currly brace in disin a yaz
        System.out.println(word);

    }
}
