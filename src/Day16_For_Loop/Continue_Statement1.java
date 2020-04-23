package Day16_For_Loop;

public class Continue_Statement1 {
    public static void main(String[] args) {

        for (int i=1;i<=5;i++){

            if (i==3){  ///let's say i want to skip "3"
                continue;
            }
            System.out.println(i);

        }

        for (int i=0;i<=20;i++){
            if (i%2!=0){ //skips all odd numbers
                continue;
            }

            System.out.print(i+" ");
        }




    }
}
