package Day22_Loops_and_Arrays_Practice;

public class Practice6_Count_Even_Odd {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        int countoddnumber = 0;
        int countevennumber = 0;

        for (int each : arr) {
            if (each % 2 == 0) {
                countevennumber++;
            }
            if (!(each % 2 == 0)) {
                countoddnumber++;
            }
        }
        System.out.println(countevennumber);
        System.out.println(countoddnumber);

        System.out.println(countevennumber == countoddnumber);


    }
}
