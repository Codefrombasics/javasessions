import java.util.Scanner;

public class gettinginputfromuser {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input value");
        int useVal1=scanner.nextInt();
        System.out.println(useVal1+7);
    }
}
