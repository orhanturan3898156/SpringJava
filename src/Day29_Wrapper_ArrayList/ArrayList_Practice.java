package Day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class ArrayList_Practice {
    public static void main(String[] args) {

        ArrayList<String> shoppingList = new ArrayList<>();

        shoppingList.add("milk");
        shoppingList.add("coffee");
        shoppingList.add("bread");
        shoppingList.add("toilet paper");

        System.out.println(shoppingList);

        /*System.out.println(shoppingList.get(0));
        System.out.println(shoppingList.get(1));
        System.out.println(shoppingList.get(2));
        System.out.println(shoppingList.get(3));*/

        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println(shoppingList.get(i));
        }

        System.out.println("==============================");
        for (String each : shoppingList) {
            System.out.println(each);
        }


        //size(): helps to get length of Array >>same as length.
        System.out.println(shoppingList.size());

        System.out.println("==============================");
        int lastIndex = shoppingList.size() - 1;
        System.out.println(shoppingList.get(lastIndex));


    }
}
