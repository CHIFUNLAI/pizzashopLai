package edu.psu.ist;

import java.util.ArrayList;



public class Transaction {

    //Class Level Variables - Protect the data
    private int transactionId;
    private Order order;
    private String pType;

    //Constructor Method
    public Transaction(int _transactionId){
        this.transactionId = _transactionId;

    }

    //Setters and Getters
    public int getTransactionId() { return transactionId; }
    public void setTransactionId(int _transactionId) {this.transactionId = _transactionId;}

    public Order getOrder() { return order; }
    public void setOrder(Order _order) {this.order = _order;}

    public String getPaymentType() { return pType; }
    public void setPaymentType(String _pType) {this.pType = _pType;}

    public static void listTransactions(ArrayList<Transaction> tList){
        for (Transaction trans: tList){
            System.out.println("Transaction ID: " + trans.getTransactionId());
            System.out.println("Payment Type: " + trans.getPaymentType());
        }
    }

}

