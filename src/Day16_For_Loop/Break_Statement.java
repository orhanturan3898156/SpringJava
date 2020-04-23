package Day16_For_Loop;

public class Break_Statement {
    public static void main(String[] args) {

        //whenever we need to stop iteration forcefully , we use "BREAK" statement;

        for (int i = 1; i <= 5; i++) {


            if (i == 3) {
                break;

            }
            System.out.println("Hello World");


        }


        for (char i='a';i<='z';i++){
            System.out.println(i);

            if (i=='d'){
                break;
            }
        }


    }
}
