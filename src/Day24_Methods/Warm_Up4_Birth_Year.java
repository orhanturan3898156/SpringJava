package Day24_Methods;

import java.time.LocalDate;

public class Warm_Up4_Birth_Year {

    public static void age(int birthyear) {
        int currentyear = LocalDate.now().getYear();
        if (birthyear < currentyear && birthyear > 1900) {
            System.out.println(currentyear - birthyear);
        } else {
            System.out.println("Invalid Age");
        }

    }

    public static void main(String[] args) {
        int a = 2002;
        age(1990);
        age(1994);

        age(a);
        age(2030);
        age(1888);
        printHelloCybertek();

    }

    public static void printchello() {
        System.out.println("Hello");
    }

    public static void printccybertek() {
        System.out.println("Cybertek");


    }

    public static void printHelloCybertek() {
        printchello(); //Hello
        printccybertek();//cybertek
    }
}
