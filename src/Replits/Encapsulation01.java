package Replits;

import Day40_Encapsulation.Encapsulation;

public class Encapsulation01 {
    private int x;
    private int y;
    private int result;

    public int getResult() {
        return result;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void plus() {

        result = x + y;

    }

    public void minus() {

        result = x - y;

    }

    public static void main(String[] args) {
        Encapsulation01 a = new Encapsulation01();
        a.setX(1);
        a.setY(1);
        a.plus();
        System.out.println("1+1 = " + a.getResult());//1+1 = 2

    }

}
