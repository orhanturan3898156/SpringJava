package Day9_Nested_If_And_Ternary;
public class Ternary {
    public static void main(String[] args) {
        //ternary is short cut of if statement.it must return a value
        //?---> it means else keyword.
        // if statement must be
        //variable=(condition) ?-->>this is how it is going to be.
        //if the if statement is only returning value and assigning it to varible the we can apply ternary.

        int num=100;
        String result=" ";
        if (num%2==0){
            result="Even";
        }else {
            result="Odd";
        }
        String result2=(num%2==0)? "Even" : "odd";
        System.out.println(result);
        System.out.println(result2);



    }
}
