package Day36_Static_Block;

public class Test {
    public static void main(String[] args) {
        System.out.println(Static_Block2.tester1); //does not display any info for tester1
        //then we copied same tester1 info from "Static_Block2 into static block. it allows me to get those info


        System.out.println(Static_Block3.name); //gives us "null" when we put name info into main in Static Block3
        System.out.println(Static_Block3.num);




    }
}
