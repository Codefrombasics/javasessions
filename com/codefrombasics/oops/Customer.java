package com.codefrombasics.oops;

public class Customer {
    String customerName;
    String customerAddress;
    int customerId;

    
    public String getCustomerName() {
        return customerName;
    }


    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public String getCustomerAddress() {
        return customerAddress;
    }


    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }


    public int getCustomerId() {
        return customerId;
    }


    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }


    // public void displayCustomerDetails(){
    //     System.out.println("Name: "+getCustomerName()+" Address: "+getCustomerAddress()+" id: "+getCustomerId());

    // }


    @Override
    public String toString() { //this will be called when you give object inside S.O.P
        return "Customer [customerName=" + customerName + ", customerAddress=" + customerAddress + ", customerId="
                + customerId + "]";
    }
    


    
}
