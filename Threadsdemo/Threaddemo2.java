package Threadsdemo;




class CFBThread2 implements Runnable{
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

public class Threaddemo2{
    public static void main(String[] args) {
        CFBThread2 cfbThread2=new CFBThread2();
        Thread thread=new Thread(cfbThread2,"cfb");//convert normal object to thread object
        thread.start();
//        cfbThread.setName("Code from Basics");


    }
}

