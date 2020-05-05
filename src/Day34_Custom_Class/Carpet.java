package Day34_Custom_Class;

public class Carpet {
    /*
    create a custom class for the carpet class that should contain the following:
   instance variables:
   width, length, unitPrice, isPersian (boolean)
   instance methods:
   customOrder(): sets the carpet' width, length, unitprice, & isParsian
   calcCost(): should be able to caculate the total cost of the carpet and return it as double
   toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
    total price of carpet= (width+length)*unitprice
     if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice
     */


    double width;
    double length;
    double unitPrice;
    boolean isPersion;


    //total price of carpet= (width+length)*unitprice
    public double calcCost() {
        double total = (width + length) * unitPrice;
        //return (isPersion) ? total + 200 : total;
        if (isPersion) {
            return total += 200;
        } else {
            return total;
        }

    }

    public void customOrder(double carpetWidth, double carpetLength, double carpetUnitPrice, boolean carpetPersion) {
        width = carpetWidth;
        length = carpetLength;
        unitPrice = carpetUnitPrice;
        isPersion = carpetPersion;

    }

    public String toString() {
        return "width: " + width +
                "\nlength: " + length +
                "\nunit price: $" + unitPrice +
                "\nTotal cost: $" + calcCost();
    }


}
