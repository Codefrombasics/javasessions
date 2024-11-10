import java.util.Scanner;

public class Conditional_Statments {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Age");
        int age=scanner.nextInt();
        final int ELIGIBLE_AGE=18;
        boolean isEligible=age>=ELIGIBLE_AGE?true:false;
        if(age<0){
            age=Math.abs(age);
        }
        if(isEligible){
            System.out.println("Eligible to Vote");
        }
        else{
            System.out.println(age+"is not eligible to vote");
            System.out.println("try after"+(ELIGIBLE_AGE-age)+" Years ");
        }

    }
}
