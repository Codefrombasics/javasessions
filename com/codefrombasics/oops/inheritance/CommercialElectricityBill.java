package com.codefrombasics.oops.inheritance;

public class CommercialElectricityBill extends ElectricityBill{
    public CommercialElectricityBill(){
        unitPrice=15.0f;
        numberOfUnits=100;

    }

    @Override
    public void calculateBill() {
        billAmount=unitPrice*numberOfUnits;
    }
}
