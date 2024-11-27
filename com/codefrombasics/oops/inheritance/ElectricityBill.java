 package com.codefrombasics.oops.inheritance;

abstract public class ElectricityBill {
    float unitPrice;
    float billAmount;
    int numberOfUnits;

    abstract public void calculateBill();

    public void printBillDetails(){
        System.out.println("Bill Amount "+billAmount);
    }
}


