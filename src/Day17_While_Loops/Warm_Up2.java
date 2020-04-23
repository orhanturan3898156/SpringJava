package Day17_While_Loops;

public class Warm_Up2 {
    public static void main(String[] args) {
        String result="";

        for (int i=1;i<=30;i++){

            if (i%3==0 && i%5==0){
                //System.out.println(i+" FINRA");
                result=i+" FINRA";
            }
            else if (i%5==0){
                //System.out.println(i+" RA");
                result=i+" RA";

            }
            else if (i%3==0){
                //System.out.println(i+" FIN");
                result=i+" FIN";
            }else {
                System.out.println(i);
            }
            System.out.println(result);

        }

    }
}
