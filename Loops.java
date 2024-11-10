public class Loops {
    public static void main(String[] args) {
        int marks[]={55,66,78,65,72};
        // can go only in forward direction
        for (int mark : marks) {
            if(mark==78)
            continue;
            System.out.print(mark+" ");
        }
    
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
    }
}
