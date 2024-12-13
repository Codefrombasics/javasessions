package java8features;


class One implements MyfuncIntr{

    @Override
    public int display(int x) {
       return x*2;
    }
}
public class FunctionalInterface {
    public static void main(String[] args) {
        System.out.println("Main method");
//        MyfuncIntr myfuncIntr=new One();
//        myfuncIntr.display(89);

        //lambda function
        MyfuncIntr myfuncIntr1=(a)->{
            System.out.println("from Lambda Function");
          return   a*2;};
        myfuncIntr1.display(9);

        Inter1.display();
    }
}
