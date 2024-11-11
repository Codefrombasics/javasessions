import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int marks[]={55,66,78,65,72};
        // can go only in forward direction
        // for (int mark : marks) {
        //     if(mark==78)
        //     continue;
        //     System.out.print(mark+" ");
        // }
    
        // for (int i = 0; i < marks.length; i++) {
        //     System.out.println(marks[i]);
        // }
        // System.out.println();
        // for(int i=marks.length-1;i>=0;i--){
        //     System.out.println(marks[i]);
        // }

        // int i=marks.length-1;
        
        // for(System.out.println("one");i>=0;System.out.println("n times"));{
        //     System.out.println(marks[i]);
        //     i--;
        // }

        // // for(;;){

        // // }
        // System.out.println("hi");

        // int num1=20;
        // while (num1<30){
        //     System.out.println(num1);
        //     num1++;
        // }

        //write  a code to get input from user and add all the number he give and ask for his choice, when he says
        //no stop asking input and print the result
    //    0+1+2 3 4
        int total=0;
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Enter a number");
            int num=scanner.nextInt();
            
            // System.out.println("would you like to give another number (y/n)");
            // String choice=scanner.next();//next() will not take the character after space
            if(num<0){
                break;
            }
            total+=num;

        }
        System.out.println("total: "+total);
    }
}

