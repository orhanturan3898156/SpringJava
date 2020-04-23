package Day20_Arrays;

import java.util.Arrays;

public class Arrays_Utilities {
    public static void main(String[] args) {
        //Arrays class= presented in "java.util"
        /*we need import statement of
        "import PackageName.classname "
        import java.util.Arrays.

         */
        int[] arr = {1, 2, 3};

        System.out.println(arr);
        String r = Arrays.toString(arr);
        System.out.println(Arrays.toString(arr));

        String[] names = {"Ali", "Ahmet", "Mehmet", "Tonguc"};
        // System.out.println(names); //it gives you "[Ljava.lang.String;@1d81eb93"

        String result = Arrays.toString(names);
        System.out.println(result);


        double[] nums = {10, 20, 30, 40, 50};
        String resultnums = Arrays.toString(nums);
        System.out.println(resultnums);
        System.out.println(Arrays.toString(nums));

        System.out.println(nums[0] + 1);

    }
}
