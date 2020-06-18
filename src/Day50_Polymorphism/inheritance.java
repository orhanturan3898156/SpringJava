package Day50_Polymorphism;

public class inheritance {
    public int publicInt = 100;
    protected int protectedInt = 200;
    int defaultInt = 300;
    private int privateInt = 400;//private cannot be inherited.

}

class Data extends inheritance {
    //3 variables inherited.public,protected,default.

    public static void main(String[] args) {
        Data obj = new Data();
        System.out.println(obj.publicInt);
        System.out.println(obj.protectedInt);
        System.out.println(obj.defaultInt);



    }

}