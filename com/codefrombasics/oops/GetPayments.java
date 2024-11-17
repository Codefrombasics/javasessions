package com.codefrombasics.oops;

public class GetPayments {
    public void getPayment(String cardNumber,int cvv,int expiryDate){
        System.out.println("card number "+cardNumber);
        System.out.println("cvv "+cvv);
        System.out.println("expiryDate "+expiryDate);
    }
    public void getPayments(String bankName,String userName,String amount){
        System.out.println("bankname"+bankName);
        System.out.println("username "+userName);
        System.out.println("amount "+amount);
    }

    public void getPayments(String upiID,String amount){
        System.out.println("upiID "+upiID);

        System.out.println("amount "+amount);
    }

}
