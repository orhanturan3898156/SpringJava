package Replits;

public class GasTank {
    double amount = 0;
    double capacity;

    public GasTank(double capacity) {
        this.capacity = capacity;
    }

    public void addGas(double adding) {
        amount += adding;
        if (amount > capacity) {
            amount = capacity;
        }

    }

    public void useGas(double using) {
        amount -= using;
        if (amount < 0) {
            amount = 0;
        }
    }

    public boolean isEmpty() {
        if (amount < 0.1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (amount > -0.1) {
            return true;
        } else {
            return false;
        }
    }

    public double getGasLevel() {
        return amount;
    }

    public double fillUp() {
        return capacity - amount;
    }
}
