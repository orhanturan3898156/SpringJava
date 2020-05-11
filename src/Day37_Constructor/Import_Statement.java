package Day37_Constructor;

import java.util.Arrays;//only import Arrays class from util
//import java.util.*; //another way, but import all classes in java util. Not preferred.

// static import: we can import static variable or methods
//import static PackageName.className.name;


/*import static Day37_Constructor.Data.staticVariable;
import static Day37_Constructor.Data.staticMethod;

 */
//you can use this one as well for both of them
//means instead of give two seperate , we can use this.
import static Day37_Constructor.Data.*;

public class Import_Statement {
    public static void main(String[] args) {
        int[] arr={4,3,2,1};
        Arrays.sort(arr);

        System.out.println(staticVariable);



    }
}
