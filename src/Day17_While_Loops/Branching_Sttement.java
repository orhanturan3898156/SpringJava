package Day17_While_Loops;

public class Branching_Sttement {
    public static void main(String[] args) {
        //SYSTEM.EXIT(0)>>>it stops entire system
        //break: exists loop and switch statement
        //continue>> skips current iteration

        for (int i=0;i<5;i++){
            if (i%2!=0){

                System.exit(0); ///it is going to stop everything. "Hi will not be executied.
            }
            System.out.println(i);
        }
        System.out.println("Hi");



    }
}
