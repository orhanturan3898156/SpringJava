package Replits;

public class TV1_Encapsulation {
    int channel1 = 1;
    int volumeLevel = 1;
    boolean on = false;
    String brand = "undefined";

    public TV1_Encapsulation() {
        System.out.println("Creating TV object using no Args- constructor");
    }

    public TV1_Encapsulation(String brand) {
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public int getChannel1() {
        return channel1;
    }

    public void setChannel1(int channel1) {
        this.channel1 = channel1;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void channelUp() {
        String message = "ERROR: TV is either OFF or invalid Channel";
        if (channel1 <= 0 && channel1 > 120) {
            System.out.println(message);
        } else {
            channel1 += 1;
        }

    }

    public void channelDown() {
        String message = "ERROR: TV is either OFF or invalid Channel";
        if (channel1 <= 0 && channel1 > 120) {
            System.out.println(message);
        } else {
            channel1 -= 1;
        }
    }

    public void volumeUp() {
        if (!on && volumeLevel < 0 && volumeLevel > 7) {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        } else {
            volumeLevel += 1;
        }
    }

    public void volumeDown() {
        if (!on && volumeLevel < 0 && volumeLevel > 7) {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        } else {
            volumeLevel -= 1;
        }
    }

    public void isOn() {
        if (on) {
            System.out.println("TV is alreay ON");
        }

    }

    public void isOff() {
        if (!on) {
            System.out.println("TV is alreay Off");
        }
    }

    public void turnOn() {
        System.out.println("turning on");
    }


}
