import java.util.Scanner;

public class gettinginputfromuser {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value");
        int userVal=scanner.nextInt();
        System.out.println(userVal+7);
    }
}
