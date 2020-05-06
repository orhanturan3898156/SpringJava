import java.util.ArrayList;
import java.util.Arrays;

public class computerObject {
    public static void main(String[] args) {

        computer computer1=new computer();
        computer1.setComputerInfo("Mac",742928919,"Gray",2000,256);
        System.out.println(computer1);

        computer[] computers={new computer(),new computer(),new computer(),new computer()};

        computers[1].setComputerInfo("Dell",23121809,"Black",1250,128);
        computers[2].setComputerInfo("HP",1299023821,"White",1000,512);
        computers[3].setComputerInfo("Sony",120912098,"Red",1300,512);

        ArrayList<computer> compu=new ArrayList<>();
        compu.addAll(Arrays.asList(computer1,computers[1],computers[2],computers[3]));
        System.out.println(compu.size());
        System.out.println(compu);
        System.out.println("=================================================================");
        ArrayList<computer> memory128More=new ArrayList<>(Arrays.asList(computer1,computers[1],computers[2],computers[3]));

        memory128More.removeIf(p-> p.memory<=128);
        System.out.println(memory128More.size());
        //System.out.println(memory128More);
        /*for (computer each:memory128More){
            System.out.println(each);
        }

         */
        for (int i = 0; i <memory128More.size() ; i++) {
            System.out.println(memory128More.get(i).color);
        }





    }

}
