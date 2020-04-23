package Day16_For_Loop;
public class Continue_Statement3_remove_doublicate {
    public static void main(String[] args) {

        String str="ABABC";  //ab
        //           0123
        String result="";

        for (int i=0;i<=str.length()-1;i++){
            if (!result.contains(""+str.charAt(i))) {

                result += str.charAt(i);
            }
            /*if (result.contains(""+str.charAt(i))){
                continue;
            }
            result+=str.charAt(i);*/

        }
        System.out.println(result);




    }
}
