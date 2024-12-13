package java8features;

public interface Inter1 {
    void show();
    default void demo(){
        System.out.println("Default demo");
    }
   static double display(){
        System.out.println("good morning");
        return 0;
    }
}
