package Replits;

public class Accumulator {
    int sum;

    public Accumulator(int value) {
        this.sum=value;
    }
    public int getSum(){
        return sum;
    }
    public void add(int parameter){
        sum+=parameter;
    }
    public void remove(int parameter2){
        sum-=parameter2;
    }

    public String toString(){
        return "Sum is: "+sum;
    }

}
