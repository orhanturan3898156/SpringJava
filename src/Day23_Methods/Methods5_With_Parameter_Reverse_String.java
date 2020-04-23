package Day23_Methods;

public class Methods5_With_Parameter_Reverse_String {

    /*
    create a funtion to reverse the given string

     */
    public static void main(String[] args) {
        String name1 = "Orhan";
        reversed(name1);

        String name2 = "Elif";
        reversed(name2);


    }


    public static void reversed(String str) {

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();


    }
}
