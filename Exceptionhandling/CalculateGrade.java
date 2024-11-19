package Exceptionhandling;

public class CalculateGrade {
    public void divide(int num1,int num2) throws ArithmeticException{
        System.out.println(num1/num2);
    }
    public static void main(String[] args)  {
        CalculateGrade cg=new CalculateGrade();
        cg.divide(9,0);
        int marks=-1;
//        if(marks<0){
//            try {
//
//                throw new InvalidMarksException("Marks should be between 0-100");
//            } catch (InvalidMarksException e) {
//                throw new RuntimeException(e);
//            }
//        }
    }
}
