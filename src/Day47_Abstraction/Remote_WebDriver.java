package Day47_Abstraction;

public abstract class Remote_WebDriver {

    protected abstract void get(String URL); //we ignore the body here.because there is no one universal way to get URL.
    //To be able to do it, we need to make this method to "abstraction"
    //Parallel to this , THE CLASS MUST BE "ABSTRACTION" , as well.
    // our method cannot be "PRIVATE". There is no way to override private method.
    //Also, it cannot be FINAL and STATIC.

    //NOTE: if a class is final, we cannot use Abstraction. Because when use final key word, we cannot make inheritance.
    //Reason is when give final, we don't want to change it.

    //if a class is abstract, we cannot create object when try to run.
    //Means we cannot create an object of Remote_WebDriver class
    //Reason is: Abstract is not concrete. because we hide the implementation.


    //When a regular class extends abstract class, it is require (MUST) to override all abstract methods
    //However, if extends class is abstract,too, you dont need to override.


    public abstract void quit();


}
