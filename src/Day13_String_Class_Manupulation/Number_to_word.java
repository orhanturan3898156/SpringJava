package Day13_String_Class_Manupulation;

import java.util.Scanner;

public class Number_to_word {
    public static void main(String[] args) {
        /*
        write a java program that can convert any given numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".
MUST use Scanner and switch statement*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number between 0 to 9");
        byte number=scan.nextByte();
        String result="";
        switch (number){
            case 0:
                result="zero";
                break;
            case 1:
                result="one";
                break;
            case 2:
                result="two";
                break;
            case 3:
                result="three";
                break;
            case 4:
                result="four";
                break;
            case 5:
                result="five";
                break;
            case 6:
                result="six";
                break;
            case 7:
                result="seven";
                break;
            case 8:
                result="eight";
                break;
            case 9:
                result="nine";
                break;
            default:
                result="Invalid";
                break;
        }
        System.out.println(result);

        String result2=(number==0)? "zero":
                (number==1)? "one":
                        (number==2)? "two":
                                (number==3)? "three":
                                        (number==4)? "four":
                                                (number==5)? "five":
                                                        (number==6)? "six":
                                                                (number==7)? "seven":
                                                                        (number==8)? "eight":
                                                                                (number==9)? "nine":
                                                                                        "Invalid";
        System.out.println(result2);



    }
}
