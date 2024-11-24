package Threadsdemo;

public class NoSynchronization {
    public static void main(String[] args) {
        Depositamount depositamount=new Depositamount();
        Thread t1=new Thread(depositamount,"User 1");
        Thread t2=new Thread(depositamount,"User 2");
        t1.start();
        t2.start();
    }
}
