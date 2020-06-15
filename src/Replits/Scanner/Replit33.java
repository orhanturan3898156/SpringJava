package Replits.Scanner;

import java.util.Scanner;

public class Replit33 {
    public static void main(String[] args) {
        /*
        -Declare int variables: seniorCitizens, nonSeniorCitizens, age
-Create a Scanner object
- Ask user to enter count for seniorCitizens and nonSeniorCitizens using message:
"Enter current count for seniorCitizens and nonSeniorCitizens:"

-Ask user to enter age:
"What is new citizen's age?"

-if citizen's age is more than or equals to 65 then print "Senior Citizen" and increment seniorCitizens variable by 1.

-if citizen's age is less than 65 then print "Non-Senior Citizen" and increment nonSeniorCitizens variable by 1.

-At last, print another message:
"New seniorCitizens count ValueOfVariable"
"New nonSeniorCitizens count ValueOfVariable"

Example Run:

Enter current count for seniorCitizens and nonSeniorCitizens:
5
4
What is new citizen's age?
66
Senior Citizen
New seniorCitizens count 6
New nonSeniorCitizens count 4
         */
        int seniorCitizen;
        int nonSeniorCitizen;
        int age;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        seniorCitizen = scan.nextInt();//6
        nonSeniorCitizen = scan.nextInt();//4
        System.out.println("What is new citizen's age?");//78
        age=scan.nextInt();

        if (age>=65){
            seniorCitizen++;
            System.out.println("Senior citizen");
        }else {
            nonSeniorCitizen++;
            System.out.println();
        }
        System.out.println("New seniorCitizens count ValueOfVariable: "+seniorCitizen);
        System.out.println("New nonSeniorCitizens count ValueOfVariable: "+nonSeniorCitizen);



    }
}
