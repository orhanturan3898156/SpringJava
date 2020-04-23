package Day16_For_Loop;

public class Continue_Statement2_Practice {
    public static void main(String[] args) {
        //d,j,y

        for (char i='z';i>='a';i--){
            if (i=='o' || i=='r' || i=='h' || i=='a' || i=='n'){
                continue;
            }
            System.out.print(i+" ");

        }
        System.out.println("\n");

        for (int i=1;i<=100;i++){
            if (i%3==0 && i%5==0){
                continue;
            }
            System.out.print(i+" ");
        }






    }
}
