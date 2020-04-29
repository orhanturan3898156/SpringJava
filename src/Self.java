import java.util.ArrayList;
import java.util.Arrays;

public class Self {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(7);
        list1.add(8);
        System.out.println(list1);
        list1.add(3, 19);
        System.out.println(list1);
        System.out.println("==================================================================");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(100);
        list3.add(200);
        list3.add(300);
        list3.add(400);
        System.out.println(list3);
        int a = 1;
        list3.remove(a);
        System.out.println(list3);

        System.out.println("==================================================================");


        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);



        int num1=list.indexOf("D");
        System.out.println(num1);




    }


}