package Day41_Inheritance;

public class audioBook extends book {
    /*
    title
    author
    price
    toString()  >>>>these are all inherited automatically.
     */

    public String length;
    public void listen(){
        System.out.println("Listening to "+title);
    }
}
