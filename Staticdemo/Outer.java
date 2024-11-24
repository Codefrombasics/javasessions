package Staticdemo;

public class Outer {

    static int out = 10;

  static class Inner {
        int in = 25;

       void show() {
            System.out.println("Inside inner " + in);
            int result = out + in;
            System.out.println(result);
        }
    }

}
