package Replits;

public class AssesmentTest2 {
    public static void main(String[] args) {
        String target="I love laptop laptop";
        String sentence="laptop";

        boolean result=appears(target,sentence);
        System.out.println(result);




    }
    public static boolean appears(String target,String sentence){

        String[] arr=target.split(" ");

        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i].equalsIgnoreCase(sentence)){
                count++;

            }
        }

        return count==2;




    }
}
