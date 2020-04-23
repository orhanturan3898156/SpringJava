package Day23_Methods;

public class Methods2_Practice {
    public static void main(String[] args) {
        /*
        tep1: Hello Cybertek
step2: Hello World 5 times
step3: Hello Btach 18
step4: Hello World 5 times
step5: Helle Saim
step6: Hello World 5 times
         */


        naber();
        newMethod();


    }

    public static void naber() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello cybertek");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }

        System.out.println("Hello Batch 18");

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }

        System.out.println("Hello Saim");

        System.out.println("Hello Batch 18");
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }

    public static void newMethod(){
        System.out.println("Additional Step");
    }

}
