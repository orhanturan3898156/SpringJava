package Day45_Exceptions;

public class Throws_Keyword {
    //We have two ways.
    public static void sleep() {

        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }
    }

    public static void sleep2() throws Exception {

        Thread.sleep(3000);
    }

    public static void main(String[] args) throws Exception {

        System.out.println("CyberTek");
        sleep(); //doesnt give compile error when decleared
        System.out.println("Java");

        System.out.println("--------------------------");

        System.out.println("CyberTek");
        sleep2(); //give compile first. We have to give "Throws " key word to main method as well.
        System.out.println("Java");


    }

    public static void sleep3() throws Exception {
        Thread.sleep(3000);

    }
}
