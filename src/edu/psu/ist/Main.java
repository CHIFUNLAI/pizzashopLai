package edu.psu.ist;
/*
Project: Lab 9
Purpose Details: Pizza ordering application
Course: IST 242
Author: Joe Oakes
Date Developed: 3/14/19
Last Date Changed: 3/13/19
Rev: 2
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    int cCount = 1;
    int oCount = 1;
    int tCount = 1;


    public static void main(String[] args) {

        Main main = new Main();

        final char EXIT_CODE = 'E';
        final char CUST_CODE = 'C';
        final char MENU_CODE = 'M';
        final char ORDE_CODE = 'O';
        final char TRAN_CODE = 'T';
        final char CUST_PRNT = 'P';
        final char HELP_CODE = '?';
        char userAction;
        final String PROMPT_ACTION = "Add 'C'ustomer, 'P'rint Customer, List 'M'enu, Add 'O'rder, List 'T'ransaction or 'E'xit: ";
        ArrayList<Customer> cList = new ArrayList<>();
        ArrayList<Menu> mList = new ArrayList<>();
        ArrayList<Order> oList = new ArrayList<>();
        ArrayList<Transaction> tList = new ArrayList<>();


        Menu menu1 = new Menu(1, "Plain   $6");
        Menu menu2 = new Menu(2, "Meat    $6");
        Menu menu3 = new Menu(3, "Extra   $6");
        Menu menu4 = new Menu(4, "Veg     $6"); //Comment

        mList.add(menu1);
        mList.add(menu2);
        mList.add(menu3);
        mList.add(menu4);


        userAction = getAction(PROMPT_ACTION);

        while (userAction != EXIT_CODE) {
            switch (userAction) {
                case CUST_CODE:
                    cList.add(main.addCustomer());
                    break;
                case CUST_PRNT:
                    Customer.printCustomer(cList);
                    Order.printOrder(oList);
                    Transaction.listTransactions(tList);
                    break;
                case MENU_CODE:
                    Menu.listMenu(mList);
                    break;
                case ORDE_CODE:
                    oList.add(main.addOrder());
                    break;
                case TRAN_CODE:
                    tList.add(main.addTransaction());
                    break;
            }

            userAction = getAction(PROMPT_ACTION);
        }
    }

    public static char getAction(String prompt) {
        Scanner scnr = new Scanner(System.in);
        String answer = "";
        System.out.println(prompt);
        answer = scnr.nextLine().toUpperCase() + " ";
        char firstChar = answer.charAt(0);
        return firstChar;
    }

    public Customer addCustomer() {
        Customer cust = new Customer(cCount++);
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please Enter your Name: ");
        cust.setCustomerName(scnr.nextLine());
        System.out.println("Please Enter your Phone: ");
        cust.setCustomerPhoneNumber(scnr.nextLine());
        return cust;

    }

    public Order addOrder() {
        Order order = new Order(oCount++);
        Scanner sr = new Scanner(System.in);
        System.out.println("Please choose for your Menu Item:");
        order.setMenuItem(sr.nextLine());
        Scanner sd = new Scanner(System.in);
        System.out.println("How many do you want?");
        order.setquantity(sd.nextInt());
        return order;
    }

    public Transaction addTransaction() {
        Transaction transaction = new Transaction(tCount++);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your payment type: ");
        transaction.setPaymentType(sc.nextLine());
        return transaction;
    }
}

