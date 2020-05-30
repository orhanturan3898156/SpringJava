package Day45_Exceptions;

import java.io.IOException;
import java.util.NoSuchElementException;

public class THROW_Keyword {
    public static void main(String[] args) {
        NoSuchElementException obj = new NoSuchElementException();

        //throw new NoSuchElementException();
        //throw obj;

        /*
        throws: used for handling checked exceptions,indicates that the methods throws an exception.
        MUST be used in methed signature
        public static void method() throws Exception
        the caller of the methid is responsible for handling the exception


          */
        /*
        THROW: manually throwing the exception DOESNOT handle
         */

        /*
        boolean breakTime=true;

        if (breakTime){
            throw new RuntimeException("It is break time, we should take a break");
        }


         */

        try {
            throw new IOException();
        } catch (Exception e) {

        }


    }
}
