package Day25_Methods;

public class Warm_Up3_Frequency {

    public static void main(String[] args) {
        String str1="AAA";
        String str2="A";

        int count=0;

        while (str1.contains(str2)){

            count++;
            str1=str1.replaceFirst(str2,"");


        }

        System.out.println(count);

        String a="pythonpythonpythonpythonpython";
        String b="python";

        int result=frequency(a,b);
        System.out.println(result);





    }

    public static int frequency(String str1, String str2){


        int count=0;

        while (str1.contains(str2)){

            count++;
            str1=str1.replaceFirst(str2,"");


        }

        return count;




    }
}
