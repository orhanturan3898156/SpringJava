package Day15_For_Loop;

public class For_Loop_Practice {
    public static void main(String[] args) {
        /*
        odd number between 1-100
         */

        String result="";
        for (int number=1;number<=100;number+=2){
            //System.out.println(number);
            result+=number + " ";
        }
        System.out.println(result);

        String resulteven="";
        for (int evennumber=0;evennumber<=100;evennumber+=2){
            resulteven+=evennumber+" ";
        }
        System.out.println(resulteven);

    }
}
