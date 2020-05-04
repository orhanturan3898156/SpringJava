package Replits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveAll {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("hi", "hey", "hi", "yo"));




    }

    public static void wordList(ArrayList<String> list, String targetWord) {

        System.out.println(list.removeAll(Arrays.asList(targetWord)));


    }
}
