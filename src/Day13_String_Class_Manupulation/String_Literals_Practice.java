package Day13_String_Class_Manupulation;

public class String_Literals_Practice {
    public static void main(String[] args) {
        String str1="Cat";  //go to pool
        String str2=new String("Cat");//go to Java Heap
        String str3="Cat";
        String str4=new String("Cat");
        System.out.println(str1==str2);

        System.out.println(str1==str3);//equal

        System.out.println(str2==str4);//not equal,because it is saved in somewhere different even though it looks visibily same


        //String represnts the sequences of chracters
        //it starts from zero, cannot be negative
        String str5="Cat";
        //           012


    }
}
