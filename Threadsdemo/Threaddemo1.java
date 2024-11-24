package Threadsdemo;

class CFBThread extends Thread{
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

public class Threaddemo1{
    public static void main(String[] args) {
        CFBThread cfbThread=new CFBThread();
//        cfbThread.setName("Code from Basics");

        cfbThread.start();//call the run method
    }
}

