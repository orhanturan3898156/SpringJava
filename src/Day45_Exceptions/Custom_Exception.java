package Day45_Exceptions;

  /*
    how to create custom unchecked eception:
    A: by extending RuntimeException

    how to create custom unchecked eception:
    A: by extending




     */

class BreakTimeException extends RuntimeException {  //it is custom unchecked exception now.

}

public class Custom_Exception {
    public static void main(String[] args) {

        boolean breakTime = true;
        if (breakTime) {
            throw new BreakTimeException();
        } else {
            System.out.println("continue class");
        }

        throw new RuntimeException("it is break time,we should take a break");


    }


}
