package Day21_Arrays;

public class Warmup_Practice2_Longest_Shortes_Word {
    public static void main(String[] args) {
        /*
        2. write a program that can return the logest string of text from an array
         */

        /*String[] words = {"hello", "whatsupp", "bye", "banana", "heyyyyyyyyyyyyy"};

        int longest = words[0].length();
        //System.out.println(longest);
        String longestword = "";


        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longest) {

                longestword = words[i];
            }
        }
        System.out.println(longestword);*/


        String[] names={"Reem","Omer","Muhtar","Emrah","Mohammed","Ana","AAAAAAABBBBBBBBBAAAA"};

        int maxlengthString=names[0].length();
        int minlengthString=names[0].length();


        String longestword="";
        String shortestword="";

        for (int i=0;i<names.length;i++){
            if (names[i].length()>maxlengthString){
                longestword=names[i];
            }
            if (names[i].length()<minlengthString){
                shortestword=names[i];
            }



        }
        System.out.println("Longest word: "+longestword);
        System.out.println("Shortest word:  "+shortestword);



    }
}
