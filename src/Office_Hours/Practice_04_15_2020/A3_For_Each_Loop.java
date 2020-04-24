package Office_Hours.Practice_04_15_2020;

public class A3_For_Each_Loop {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        for (int each : arr) {
            if (each == 3) {
                continue;// sadece 3 u almiyo!
                //  break; // 1 ve 2 yi alip 3 ve sonrasini almiyor
            }
            System.out.println(each);
        }
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int each1 : arr2) {
            if (each1 % 2 == 0) {
                System.out.println(each1);
            }

        }


    }
}

