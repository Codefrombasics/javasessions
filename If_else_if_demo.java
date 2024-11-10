public class If_else_if_demo {
    public static void main(String[] args) {
        //find greatest of three numbers
        int num1=15,num2=19,num3=20;
        // if((num1>num2)){
        //     if(num1>num3){
        //     System.out.println(num1+" is greatest");
        //     }
        //     else{
        //         System.out.println(num3+" is greatest");
        //     }
        // }else{
        //     if(num2>num3){
        //         System.out.println(num2+" is greatest");
        //     }
        //     else{
        //         System.out.println(num3+" is greatest");
        //     }
        // }

        if((num1>num2)&&(num1>num3)){
            System.out.println(num1+"is greatest");
        }else if(num2>num3){
            System.out.println(num2+" is greatest ");
        }else{
            System.out.println(num3+" is greatest ");
        }
    }
}
