package Replits;

public class Replit156 {
    public static void main(String[] args) {

        String[] names={"orhan","elif","mehmet","yusuf","orhan","Orhan"};

        String str="mahmut";

        int result=abc(names,str);
        System.out.println(result);




    }

    public static int abc(String[] arr, String str){

        int count=0;

        for(int i=0;i<arr.length;i++){

            if (arr[i].equalsIgnoreCase(str)){
                count++;
            }


        }




        return count;
    }
}
