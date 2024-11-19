package Exceptionhandling;

//public class Exc {
//    public static void main(String[] args) {
//        System.out.println("Before Exception");
//        try {
//            System.out.println(1 / 0);
//        } catch (Exception e) {
////            System.out.println(e.getMessage());
//            //to see the line in which the exception has been raised
//            e.printStackTrace();//use only in Dev Environment
//        }
//        System.out.println("After Exception");
//    }
//}
// EXAMPLE FOR UNCHECKED EXCEPTION
public class Exc {
    public static void main(String[] args) {
        System.out.println("Before Exception");
        int arr[]={89,90};
        int num1=10,num2=1;
        try {
            System.out.println(num1 / num2);
            System.err.println(arr[10]);
        }
        catch (ArithmeticException|ArrayIndexOutOfBoundsException ae){
            System.out.println(ae.getMessage());
        }catch (Exception e ){

        }
        finally {
            System.out.println("this is finally block");
        }
//
//        catch (Exception e) {
////            System.out.println(e.getMessage());
//            //to see the line in which the exception has been raised
//            e.printStackTrace();//use only in Dev Environment
//        }
        System.out.println("After Exception");
    }
}
