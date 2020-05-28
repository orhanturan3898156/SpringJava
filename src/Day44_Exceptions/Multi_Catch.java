package Day44_Exceptions;

import java.util.NoSuchElementException;

public class Multi_Catch {
    public static void main(String[] args) {
        //if we give parent class, we cannot give child class after it.

        try {
            System.out.println(100 / 0);
        } catch (ClassCastException e) {
            System.out.println("Class Cast");
        } catch (NoSuchElementException e) {
            System.out.println("No such Element");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("index out of bound");
        } catch (ArithmeticException e) {
            System.out.println("Arithmatic");  ///"ArithmeticException" is before "RuntimeException".that's why first one will be executed first.
        } catch (RuntimeException e) {
            System.out.println("Runtime");
        }



    }
}
