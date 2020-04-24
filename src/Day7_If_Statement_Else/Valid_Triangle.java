package Day7_If_Statement_Else;


public class Valid_Triangle {
    public static void main(String[] args) {
        double angle1 = 30;
        double angle2 = 50;
        double angle3 = 100;

        double sumOfAngles = angle1 + angle2 + angle3; //short sumOfAngles=(short)(angle1+angle2+angle3);
        boolean validTriangle = sumOfAngles == 180;
        if (validTriangle) {
            System.out.println("The shape is a valid triangle ");

        }
        if (!validTriangle) {
            System.out.println("The shape is a not a valid triangle");
        }


    }
}
