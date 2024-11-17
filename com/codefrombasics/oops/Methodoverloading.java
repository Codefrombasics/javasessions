package com.codefrombasics.oops;

public class Methodoverloading {
    public static void main(String[] args) {
        GetPayments getPayments=new GetPayments();

        getPayments.getPayments("hello@okhdfcbank","890");
        getPayments.getPayment("6787-9087-7899",567,1124);
        getPayments.getPayments("HDFC Bank","CFB","786");
    }
}
