package Day52_Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q {
    public static void main(String[] args) {
        Queue<String> q=new PriorityQueue<>(); //reason we made object reference type different than Queue,it is Interface and we cannot create an object from it.
        q.add("A");
        q.add("B");
        q.add("C");
        q.add("D");

        System.out.println(q);

        String str=q.poll(); //it returns very first object. A
        System.out.println(str);

        System.out.println(q);

    }
}
