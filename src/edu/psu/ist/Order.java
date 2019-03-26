package edu.psu.ist;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    //Class Level Variables - Protect the data
    private int orderId;
    private int quantity;
    private String MenuItem;



    //Constructor Method
    public Order(int _orderId) {
        this.orderId = _orderId;

    }


    //Setters and Getters
    public int getorderId() {
        return orderId;
    }

    public void setorderId(int _orderId) {
        this.orderId = _orderId;
    }

    public int getquantity(){return quantity;}

    public void setquantity(int _quantity){this.quantity = _quantity; }

    public String getMenuItem(){return MenuItem;}

    public void setMenuItem(String _MenuItem){this.MenuItem = _MenuItem; }



    public static void printOrder(ArrayList<Order> oList) {
        for (Order order : oList) {
            System.out.println("Order Id: " + order.getorderId());
            System.out.println("Your Menu Item: " + order.getMenuItem());
            System.out.println("Quantity:" + order.getquantity());
            System.out.println("Your Total Cost:" + "$" + order.getquantity() * 6 );
        }
    }
}

