public class Operators {
    public static void main(String[] args) {
        //arithmetic operator
        int num1,num2;//77->14 81->9, 93->12
        num1=20;
        num2=7;
        // System.out.println("num1 "+num1+" "+"num2 "+num2);
        // System.out.println(num1+"+"+num2+" = "+(num1+num2));
        // System.out.println(num1+"-"+num2+" = "+(num1-num2));
        // System.out.println(num1+"*"+num2+" = "+(num1*num2));
        // System.out.println(num1+"/"+num2+" = "+(num1/num2));
        // System.out.println(num1+"%"+num2+" = "+(num1%num2));
      


        // Relational operator-while, for, if, ifelse if- returns true or false, only condition we can check
        //   System.out.println(num1+">"+num2+" = "+(num1>num2));
        //   System.out.println(num1+">="+num2+" = "+(num1>=num2));
        //   System.out.println(num1+"<"+num2+" = "+(num1<num2));
        //   System.out.println(num1+"<="+num2+" = "+(num1<=num2));
        //   System.out.println(num1+"=="+num2+" = "+(num1==num2));
        //   System.out.println(num1+"!="+num2+" = "+(num1!=num2));

          //logical operators and-&&,or-||,not !
          int num3=15;
          System.out.println("("+num1+">"+num2+")&&("+num1+">"+num3+")"+"= "+((num1>num2)&&(num1>num3)));
          System.out.println("("+num1+">"+num2+")||("+num1+">"+num3+")"+"= "+((num1>num2)||(num1>num3)));
          System.out.println("!("+num1+">"+num2+")||("+num1+">"+num3+")"+"= "+!((num1>num2)||(num1>num3)));
        //   System.out.println(num1+"!="+num2+" = "+(num1!=num2));

        //assignment operator
        // num1+=10;
        // num1-=7;
        // num1*=10;
        // num1/=20;
        // System.out.println("incremented num1 "+num1);

        // 16 8 4 2 1
        //  1 0 1 0 0
        //  1 0 1 1 1
        //  ---------
        //  1 0 1 1 1
        //incremenet or decrement operator ++(add 1 with existing value)- --(subtract 1 with existing value)

        // System.out.println("after 30 "+num1++ );
        // System.out.println(num1);
        // System.out.println("before 30 "+num1-- );
        // System.out.println(num1);

        //bitwise operators
        System.out.println("num1|num2"+(num1|num2));
        System.out.println(~5);//negative of the next number

        //conditional operator
        int result=num1<num2?num1:num2;
        System.out.println("greatest of "+num1+"and"+num2+"is "+result);

        //PEMDAS
        int result2=10+20-16/2*4;
        System.out.println(result2);


        // 10+20-8*4
        // 10+20-32
        // 30-32
        // -2
    //    num1-20,num2-7, num3-15
        int result3=num1++-num2--*num3++-num2;
        
        System.out.println(result3);
        System.out.println(num1---(num1--));
        System.err.println("Wrong output");
        System.out.println();
        System.out.println(10+20+"Helloworld");
        System.out.println("Helloworld"+10+20);
        


        



    }
}
