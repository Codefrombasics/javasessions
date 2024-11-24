package Threadsdemo;
class MyThread implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread"+Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            }catch (InterruptedException ie){
                System.out.println(ie.getMessage());
            }
        }
    }

}

public class Multithreadingdemo {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        Thread thread1=new Thread(myThread,"Mythread1");
        Thread thread2=new Thread(myThread,"Mythread2");
        Thread thread3=new Thread(myThread,"Mythread3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
