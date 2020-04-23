package Day19_Arrays;

public class Arrays2_Practice {
    public static void main(String[] args) {

        int[]  numbers={12,54,67,89,345};

        int num1=numbers[2];
        System.out.println(num1);
        System.out.println(numbers[2]);

        String[] friends = {"Azer", "Bulbul", "Mustafa", "Keser", "Ajdar"};

        String name1 = friends[2];
        System.out.println(name1);

        for (int i = 0; i <= 4; i++) {
            String names = friends[i];
            System.out.println(names);
        }

        System.out.println("==========================");

        //let's find the one who register with gamil.find them

        String[] emails = {"cybertek@yahoo.com", "cybertek@gmail.com", "cybertek@hotmail.com", "cybertek@outlook.com"};

        for (int i = 0; i <= 3; i++) {

            String email = emails[i];
            if (email.endsWith("@gmail.com")) {
                System.out.println(email);
            }
        }


    }
}
