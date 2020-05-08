package Day36_Static_Block;

import Office_Hours.Practice_05_06_2020_CustomClass.Developer;

public class Human_Resources {

    static Developer dev1 = new Developer();
    static Developer dev2 = new Developer();
    static Developer dev3 = new Developer();
    static Developer dev4 = new Developer();
    static Developer dev5 = new Developer();

    /*
    it is not going to work with main method

    public static void main(String[] args) {
        dev1.setTesterInfo("Namik","Developer",150000,46354);
    }

     */
// we need a static block. we dont give below dev1 info right after above dev1.beacuse we want to use it later somewhere else
//basically we need to declared them in the block.

    static {
        //dev1=new Developer(); we can use this instead of above one as well.
        dev1.setDevInfo("Namik", "Developer", 150000, 46354);
    }


}
