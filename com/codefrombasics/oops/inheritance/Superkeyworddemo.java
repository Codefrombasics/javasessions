package com.codefrombasics.oops.inheritance;
class Loan{
    float emiAmount;
    int numberOfMonths;
    double loanAmount;

    public Loan(float emiAmount, int numberOfMonths, double loanAmount) {
        this.emiAmount = emiAmount;
        this.numberOfMonths = numberOfMonths;
        this.loanAmount = loanAmount;
    }
    void displayLoanDetails(){
        System.out.println(emiAmount+" "+numberOfMonths+" "+loanAmount);
    }
}
class Carloan extends Loan{
    double interestRate;

    public Carloan(float emiAmount, int numberOfMonths, double loanAmount, double interestRate) {
        super(emiAmount, numberOfMonths, loanAmount);//calls super class Constructor
        this.interestRate = interestRate;
    }
    void displayCarLoanDetails(){
        System.out.println(emiAmount+" "+numberOfMonths+" "+loanAmount+" "+interestRate);
    }
    void doubleEMI(){
        super.displayLoanDetails();//accessing super class method
        System.out.println(super.emiAmount*2);//accessing super class variable
        displayCarLoanDetails();
    }
}
public class Superkeyworddemo {
    public static void main(String[] args) {
        Carloan carloan=new Carloan(3456,36,600000.00,17.5);
        carloan.displayCarLoanDetails();
        carloan.doubleEMI();
    }
}
