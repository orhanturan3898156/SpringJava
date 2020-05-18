package Replits;

public class Parking_Meter {
    int timeLeft=0;
    int maxTime;

    public Parking_Meter(int maxTime){
        this.maxTime=maxTime;
    }

    public boolean add(int value){
        if (timeLeft<maxTime &&value==25){
            timeLeft+=30;
            return true;
        }else {
            timeLeft=timeLeft;
            return false;
        }



    }
    public void tick(){
        if (timeLeft>0){
            timeLeft-=1;
        }
    }
    public boolean isExpired(){
        if (timeLeft==0){
            return true;
        }else {
            return false;
        }
    }

}
