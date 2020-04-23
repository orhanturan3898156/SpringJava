package Day22_Loops_and_Arrays_Practice;

public class Practice5_Java_Python {
    public static void main(String[] args) {
        /*
        3. write a program that can return the number of appearances of "java" and "python" anywhere in the sentence
                (it's similar to the task 97 in repl.it, But this time you MUST use arrays and for each loop)
         */

        String sentence = "I like Java and Javascript";

        // sentence=sentence.toLowerCase(); // you can do lower case if you want to make sure that it is case insensitive.

        int countJava = 0;
        int countPython = 0;
        String[] words = sentence.split(" ");

        for (String each : words) {
            if (each.contains("Java")) {
                countJava++;

            }
            if (each.contains(("python"))) {
                countPython++;
            }
        }
        System.out.println(countJava);
        System.out.println(countPython);

        System.out.println(countJava == countPython);


    }
}
