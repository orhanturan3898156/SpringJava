package Day41_Inheritance;

public class eBook extends book {
    public String size;
    public int pages;
    //in this class we have 5 variable.3 comes from "book" class. other 2 are here.
    /*
    title
    author
    price
    toString()  >>>>these are all inherited.
     */

    public void readBook() {
        System.out.println("reading " + title);
    }

}
