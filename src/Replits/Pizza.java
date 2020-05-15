package Replits;

public class Pizza {
    /*
    Create a class named Pizza that stores information about a single pizza.

It should contain the following:
Private instance variables to store the size of the pizza (either small, medium, or large),
the number of cheese toppings, the number of pepperoni toppings, and the number of ham toppings.
    Constructor(s) that set all of the instance variables.
Public methods to get and set the instance variables.
A public method named calcCost( ) that returns a double that is the cost of the pizza.
Pizza cost is determined by:
Small: $10 + $2 per topping
Medium: $12 + $2 per topping
Large: $14 + $2 per topping
A public method named getDescription() that returns a String containing the pizza size,
quantity of each topping, and the pizza cost as calculated by calcCost().

getDescription() example:
large Pizza with 0 Cheese toppings, 0 Pepperoni toppings, and 2 Ham toppings.
Total Price: 18.0
     */
    private String size;
    private int cheeseTopping;
    private int pepperoniTopping;
    private int hamTopping;

    public Pizza(String size, int cheeseTopping, int pepperoniTopping, int hamTopping) {
        this.size = size;
        this.cheeseTopping = cheeseTopping;
        this.pepperoniTopping = pepperoniTopping;
        this.hamTopping = hamTopping;
    }

    public String getSize() {
        return size;
    }

    public int getCheeseTopping() {
        return cheeseTopping;
    }

    public int getPepperoniTopping() {
        return pepperoniTopping;

    }

    public int getHamTopping() {
        return hamTopping;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setCheeseTopping(int cheeseTopping) {
        this.cheeseTopping = cheeseTopping;
    }

    public void setPepperoniTopping(int pepperoniTopping) {
        this.pepperoniTopping = pepperoniTopping;
    }

    public void setHamTopping(int hamTopping) {
        this.hamTopping = hamTopping;
    }

    public double calcCost() {
        if (size.equalsIgnoreCase("small")) {
            return (cheeseTopping + pepperoniTopping + hamTopping) * 2 + 10;
        } else if (size.equalsIgnoreCase("medium")) {
            return (cheeseTopping + pepperoniTopping + hamTopping) * 2 + 12;
        } else {
            return (cheeseTopping + pepperoniTopping + hamTopping) * 2 + 14;
        }
    }

    public String toString() {
        return size + " pizza with " + cheeseTopping + " Cheese Topping, "
                + pepperoniTopping + " Pepperoni Topping, " +
                hamTopping + ", Ham Topping" + "\nTotal Price: " + calcCost();
    }
}
class orderNow{
    public static void main(String[] args) {
        Pizza pizza1=new Pizza("large",0,0,2);
        System.out.println(pizza1);
    }
}
