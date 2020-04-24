import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Self {
    public static void main(String[] args) {
        /*LocalDate date1=LocalDate.of(2012,02,3);
        System.out.println(date1);

        LocalDate date2=LocalDate.of(2021,10,1);
        System.out.println(date2);

        LocalDate date3=LocalDate.now();
        System.out.println(date3);

        boolean result1=date1.isBefore(date2);
        System.out.println(result1);

        boolean result2=date1.isAfter(date3);
        System.out.println(result2);

        boolean result3=date3.isEqual(date1);
        System.out.println(result3);

        System.out.println("Today is "+LocalDate.now());*/


        /*DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yy/MM/dd");
        LocalDate date1=LocalDate.of(2010,3,5);
        String result1=date1.format(dtf);
        System.out.println(result1);


        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("MM_dd/_yyyy");
        LocalDate date2=LocalDate.of(2012,8,23);
        String result2=date2.format(dtf2);
        System.out.println(result2);



        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("EEE MM.dd.yyyy");
        LocalDate date3=LocalDate.of(2019,04,10);
        String result3=date3.format(dtf3);
        System.out.println(result3);*/

        /*int[] numbers1={-3,2,56,-9,34,67,90};

        int result1=minumumOfArray(numbers1);
        System.out.println(result1);

        int result2=minumum(numbers1);
        System.out.println(result2);*/

        /*int[] arr = {3, 3, 5, 4, 6, 6, 7, 9, 9};//>>>5,4,7,8

        unique(arr);
        System.out.println("===========");
        unique2(arr);

        String result3=unique3(arr);
        System.out.println(result3);*/

        /*String str="AAABBCCCCC";
        char ch='A';
        int result=frquencyOfChar(str,ch);
        System.out.println(result);
        System.out.println(frquencyOfChar2(str,ch));*/

        String str1="Java is fun Java is cool";
        String str2="Java";
        int count=0;
        String[] arr=str1.split(" ");

        for (int i=0;i<arr.length;i++){
            if (arr[i].equals(str2)){
                count++;

            }
        }
        System.out.println(count);


    }

    public static int minumumOfArray(int[] arr) {

        int minumum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minumum) {
                minumum = arr[i];
            }

        }
        return minumum;


    }

    public static int minumum(int[] arr) {
        int minumum = arr[0];
        for (int each : arr) {
            if (each < minumum) {
                minumum = each;
            }
        }
        return minumum;

    }

    public static void unique(int[] arr) {
        //int[] arr = {3, 3, 5, 4, 6, 6, 7, 8, 9, 9}>>>5,4,7,8

        for (int j = 0; j < arr.length; j++) { //3

            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == arr[j]) {
                    count++;

                }
            }

            if (count == 1) {
                System.out.println(arr[j]);
            }
        }


    }

    public static void unique2(int[] arr) {
        for (int each2 : arr) { //3

            int count = 0;
            for (int each : arr) {
                if (each == each2) {
                    count++;

                }
            }

            if (count == 1) {
                System.out.println(each2);
            }
        }
    }

    public static String unique3(int[] arr){

        String result="";
        for (int each2:arr){
            int count=0;
            for (int each:arr){
                if (each==each2){
                    count++;
                }
            }
            if (count==1){
                result+=each2+" ";
            }
        }
        return result;




    }

    public static int frquencyOfChar(String str, char ch){

        int count=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==ch){
                count++;
            }
        }




        return count;


    }
    public static int frquencyOfChar2(String str, char ch){

        int count = 0;
        char[] arr=str.toCharArray();
       for (int each:arr){
           if (each==ch){
               count++;
           }
       }



        return count;



    }

    public static int frequencyofWord(String str1, String str2){

        int count=0;
        String[] arr=str1.split(" ");

        for (int i=0;i<arr.length;i++){
            if (str1.equals(str2)){
                count++;

            }
        }



        return count;


    }

}
