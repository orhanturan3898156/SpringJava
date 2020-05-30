package Day45_Exceptions;

public class WarmUp {
    public static void main(String[] args) {
        int pushup = 1;

        while (pushup <= 20) {
            System.out.println("PushUp "+pushup);

            try {
                Thread.sleep(3000);
            } catch (Exception e) {

            }


            pushup++;
        }

    }
}
