package Threadsdemo;

public class BankAccnt {
    private int acntBalance=0;

//    public synchronized void deposit(int amount){
//        System.out.println(Thread.currentThread().getName()+" is depositing amount"+amount );
//        acntBalance+=amount;
//        System.out.println("Balance After Deposit "+acntBalance);
//    }
public void deposit(int amount){
    synchronized (this) {//synchronizing only critical codes
        System.out.println(Thread.currentThread().getName() + " is depositing amount" + amount);
        acntBalance += amount;
        System.out.println("Balance After Deposit " + acntBalance);
    }
    System.out.println("Unblocked");
}
    public int getAcntBalance(){
        return  acntBalance;
    }
}
