package Day23_Methods;

public class Methods1 {

    /*methods: grouping a series of statement to perform tasks

    ***it is reusable and easy to maintain
    declaration of method;
    Acces-modifier  specifier  return type methodname(){
    statements;
    }

    ---Access modifiers    : public, protected, default , private
    public:everybody can see.

    ---Specifier           : static, final    , abstract, synchronized
    static:method can be called through class name

    ---Return Type         : void  , any data type (all primitive  and objects like String, int, short, )
    void:does not return any value from the data type
    dataType: you can return a value now.

    ---Method Name         :

    ***method cannot be declared in another method

    */
    public static void main(String[] args) {
        printHelloWorld5times();
    }

    public static void printHelloWorld5times(){
        for (int i=0;i<5;i++){
            System.out.println("Hello World");
        }

    }
}
