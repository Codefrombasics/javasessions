package Staticdemo;
class A{
   static void show(){}
}
class B extends A{
    @Override
    void show(){}
}


public class Sample {

     int val=1;

     void show() {

        System.out.println("Show method");
         System.out.println(val);
    }

}