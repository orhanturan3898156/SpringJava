package Day5_Casting_Unary_ShortHandOperators;

public class Primitive_Casting {
    public static void main(String[] args) {
        //implicit casting ---done automaticly
        int a = 10;
        long b = a;

        int i1=234;
        short s1=(short)i1;
        System.out.println(s1);
        System.out.println("=========================================");

        long l1=109;
        int int1=(int)l1;
        System.out.println(int1);
        System.out.println("=========================================");

        short sh=23;
        double db=sh*2;
        System.out.println(db);
        System.out.println("==========================================");

        double db2=300.3;
        float fl2=(float) db2;
        System.out.println(fl2);
        System.out.println("==========================================");
        double db3=567.84;
        float in3=(float) db3;
        System.out.println(in3);
        System.out.println("==========================================");

        double db5=49.7;
        float fl5=(long)db5;
        System.out.println(fl5);


        int a1 = 100;
        long b1 = a1;          //---->manual way
        System.out.println(b1);

        System.out.println(b);


        //explicit casting you should cast with same or smaller// you do manually here always
        int Inum = 100;
        byte Bnum = (byte) Inum;
        short Snum = (short) Inum; //also short Snum=(byte)Inum;
        double Dnum = 5.5;
        //float Fnum=(float)Dnum;
        float Fnum = (int) Dnum;
        float F1 = 60.5f;
        int I1 = (int) F1;

        long LargeNum = 99999999999L;
        int IntNum = (int) LargeNum;

        char ch1 = 'a'; ////for char you can 'a,b,c' or number only
        short sh1 = (short) ch1;

        System.out.println(I1);
        System.out.println(Fnum + 1);
        System.out.println(IntNum);
        System.out.println(sh1);


    }
}
