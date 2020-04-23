package Day19_Arrays;

public class Arrays1_Intro {
    public static void main(String[] args) {
        //it helps to store multiple data in one variable

        //int scores=90,10,30;>>>regular data types can only scores "ONE " value

        /*
        declaration:
            DataType[]  variable={data1,data2,data3.......  };
            each data in the array has its own numbers.
            retrive data from the array:
            variableName[index]


         */


        int[] scores = {70, 75, 85, 90, 95, 100}; //int scores[]={70,75,85,90,95,100} you can write like this as well.
        //        0,  1,2,  3, 4, 5
        int num1 = scores[2];  //returns int
        int num2 = scores[5];
        scores[2] = 2345;  /// we asssigned a new value for index number 2

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(scores[2]);
    }
}
