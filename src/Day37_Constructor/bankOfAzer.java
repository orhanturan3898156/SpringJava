package Day37_Constructor;

import java.util.ArrayList;

public class bankOfAzer {
    public static void main(String[] args) {


        ArrayList<employee> list = new ArrayList<>();
        list.add(Human_Resources.employee3);  //0
        list.add(Human_Resources.employee5);  //1


        System.out.println(list.get(0));
        System.out.println(list.get(1));

        Human_Resources candidate1 = new Human_Resources();
        System.out.println(candidate1.employee1);

    }
}
