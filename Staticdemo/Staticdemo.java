package Staticdemo;



public class Staticdemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
       //accessing a variable without using object
//        System.out.println(Sample.val);
        Sample.show();

        Sample s=new Sample();
        s.val=10;
        s.val++;//11
        System.out.println(s.val);
        Sample s2=new Sample();
      ;
        s2.val++;//12
        System.out.println(s2.val);



        Sample2 obj1 = new Sample2();
        System.out.println(obj1.studentId);// 11

        Sample2 obj2 = new Sample2();
        System.out.println(obj2.studentId);// 12

        Sample2 obj3 = new Sample2();// 13
        System.out.println(obj3.studentId);

        System.out.println(obj1.studentId);// 13
    }

}