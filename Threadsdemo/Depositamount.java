package Threadsdemo;

public class Depositamount implements Runnable{
    BankAccnt accnt=new BankAccnt();
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            accnt.deposit(1000);
        }
    }
}
