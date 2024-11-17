package com.codefrombasics.oops;

public class Firstclass {
    int firstVal=10,secondVal=20;

    public static void main(String[] args) {
    //     Firstclass firstclass=new Firstclass();
    //    firstclass.display(firstclass);

    Customer customer=new Customer();
    customer.setCustomerAddress("Chennai");
    customer.setCustomerName("Hariharan");
    customer.setCustomerId(1001);

    Customer customer2=new Customer();
    customer2.setCustomerAddress("Hyderabad");
    customer2.setCustomerName("Manikandan");
    customer2.setCustomerId(1002);


    // String address=customer.getCustomerAddress();
    // String name=customer.getCustomerName();
    // int id=customer.getCustomerId();
    System.out.println("Details of the customer");
    // System.out.println("Name: "+name.toUpperCase()+" Address: "+address+" id: "+id);
    // System.out.println("Name: "+customer.getCustomerName()+" Address: "+customer.getCustomerAddress()+" id: "+customer.getCustomerId());
    // customer.displayCustomerDetails();
    System.out.println(customer.getCustomerId());
    System.out.println(customer);

    System.out.println(customer2);
    }

    public void display(Firstclass firstclass) {
        System.out.println(firstclass.firstVal+" " +firstclass.secondVal);
    }
    
}
