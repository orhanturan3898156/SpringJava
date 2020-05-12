package Day38_Constructors;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class Item {
    /*
    create a class called Item
    instance variables:
    name, unitPrice, quantity
    add a constructor that can initialize the fields
    instance methods:
    calcCost(): returns the total cost as double
    hint: quantity * unitPrice
    toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
    create a class called ShoppingList
    create 5 objects of Item and store them into List of Items
    calculate the total cost of all Items in the list

     */

    String name;
    double unitPrice;
    int quantity;

    public Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost() {
        return unitPrice * quantity;
    }

    public String toString() {
        return "Name: " + name +
                ", Quantity: " + quantity +
                ", Unit Price: $" + unitPrice +
                ", Total Cost: $" + calcCost();
    }
}

class ShoppingList {
    public static void main(String[] args) {
        Item item1 = new Item("Banana", 2.5, 3);
        System.out.println(item1);
        System.out.println(item1.calcCost());

        Item item2 = new Item("EggPlant", 3.5, 5);

        Item item3 = new Item("Cherry", 2, 2);

        Item item4 = new Item("Bread", 1.25, 2);

        Item item5 = new Item("Orange", 3, 5);


        ArrayList<Item> shoppingList = new ArrayList<>();
        shoppingList.addAll(Arrays.asList(item1, item2, item3, item4, item5));

        double totalCost = 0;

       /*

       for (Item each:shoppingList){
           totalCost+=each.calcCost();
       }

        */
        for (int i = 0; i < shoppingList.size(); i++) {
            totalCost += shoppingList.get(i).calcCost();

        }
        System.out.println("Total: $" + totalCost);


    }

}













