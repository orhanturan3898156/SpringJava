package Day15_For_Loop;

public class FOR_LOOP {
    public static void main(String[] args) {
        //repeated actions
        /*for loop:  for(initialization;Condition; Iterator){
          statements;
        }

        */

        //initialization:Starting point >>>int a=0; (MANDATORY)

        //condition: created based on initilaztion ,indicating ending point of the loop >>> a<5(MANDATORY)

        //iterator; it decides when the loop should stop


        for (int i=0;i<5; i++ ){
            System.out.println("Hello World");
        }
        System.out.println("========================");

        for (int i=0;i<10; ++i ){
            System.out.println(i +": "+(i*i));
        }

        System.out.println("========================");

        for (int i=1;i<11;i++){
            System.out.println(i);
        }
        System.out.println("========================");

        for (int i=100;i>=95;i--){
            System.out.println(i);
        }


    }
}
