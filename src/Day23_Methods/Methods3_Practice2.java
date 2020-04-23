package Day23_Methods;

public class Methods3_Practice2 {
    public static void main(String[] args) {
        evenNumbers1_100();
        oddNumbers();

    }

    public static void evenNumbers1_100(){
        for (int i=1;i<=100;i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();




    }
    public static void oddNumbers(){
        for (int i=1;i<=100;i++){
            if (!(i%2==0)){
                System.out.print(i+" ");
            }
        }
    }

}
