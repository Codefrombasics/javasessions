package com.codefrombasics.oops.inheritance;

public class HomeElectricityBill extends ElectricityBill{
    public HomeElectricityBill(){
        unitPrice=10.0f;
        numberOfUnits=100;

    }

    @Override
    public void calculateBill() {
        billAmount=unitPrice*numberOfUnits;
    }

    public void showUnitPrice(){
        System.out.println("HomeElectricityBill"+unitPrice);
    }
}
