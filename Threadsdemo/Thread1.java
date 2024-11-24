package Threadsdemo;

public class Thread1 {
    public static void main(String[] args) {
        Thread thread=Thread.currentThread();
        System.out.println(thread);// [ThreadName,priority,Threadgroup]
        String threadName=thread.getName();
        System.out.println("thread name is "+threadName);
        System.out.println(Thread.MAX_PRIORITY);
        thread.setPriority(7);
        System.out.println(thread.getPriority());//7



    }
}
