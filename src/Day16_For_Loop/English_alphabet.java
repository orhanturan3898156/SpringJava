package Day16_For_Loop;

public class English_alphabet {
    public static void main(String[] args) {
        //char letters;


        for (char letters='A';letters<='Z';letters++)
            System.out.print(letters+" ");

        System.out.println("\n");

        for (char letters='Z';letters>='A';letters--){
            System.out.print(letters +" ");
        }
        System.out.println("\n");

        for (char letters='a';letters<='z';letters++){
            System.out.print(letters+" ");
        }
        System.out.println("\n");
        for (char letters='z';letters>='a';letters--) {
            System.out.print(letters + " ");
        }



    }
}
