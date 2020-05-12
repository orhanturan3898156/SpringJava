package Day37_Constructor;

public class Human_Resources {

    //Main advantage of static is you can call it through class name
    static employee employee1=new employee();
    static employee employee2=new employee();
    static employee employee3=new employee();
    static employee employee4=new employee();
    static employee employee5=new employee();


    /*
    public static void main(String[] args) {

        employee1.setInfo("Zuleyha",12334,65456324,"QA",110000,'F');
        employee2.setInfo("Kyle",124253,438457,"SDET",120000,'F');
        employee3.setInfo("Marina",122389853,389323,"Teste",170000,'M');
        employee4.setInfo("Adeline",192723253,434348457,"SDET",160000,'M');
        employee5.setInfo("Jazi",12232553,438443557,"SDET",190000,'F');

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
        System.out.println(employee5);

    }
    >>>>>>this block actually not needed.
     */
    static {
        employee1.setInfo("Zuleyha",12334,65456324,"QA",110000,'F');
        employee2.setInfo("Kyle",124253,438457,"SDET",120000,'F');
        employee3.setInfo("Marina",122389853,389323,"Teste",170000,'M');
        employee4.setInfo("Adeline",192723253,434348457,"SDET",160000,'M');
        employee5.setInfo("Jazi",12232553,438443557,"SDET",190000,'F');
    }



}
