package Replits;

import java.util.ArrayList;

public class Replit187 {
    public static void main(String[] args) {




    }

    public static ArrayList<String> combineAL(ArrayList<String> worldList1, ArrayList<String> worldList2){

        ArrayList<String> list=new ArrayList<>();
        for (int i = 0; i <worldList1.size() ; i++) {

            list.add(worldList1.get(i));
        }

        for (int i = 0; i <worldList2.size() ; i++) {
            list.add(worldList1.get(i));
        }
        return list;


    }

}

