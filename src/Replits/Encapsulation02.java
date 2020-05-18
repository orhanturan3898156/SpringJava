package Replits;

import com.sun.source.tree.UsesTree;

public class Encapsulation02 {
    private String data;
    private int yint;

    public String getName() {
        return data;
    }

    public void setName(String name) {
        this.data = name;
    }

    public int getYint() {
        return yint;
    }

    public void setYint(int yint) {
        this.yint = yint;
    }

    public void insetData(String data, int yint) {
        this.data = data;
        this.yint = yint;

    }


}

class Encapsulation02_Test {
    public static void main(String[] args) {
        Encapsulation02 obj1 = new Encapsulation02();
        obj1.insetData("Ahmet", 23);


    }
}
