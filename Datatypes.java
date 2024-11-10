public class Datatypes {
    //instance variable are the variables declared outside the function inside the class
    int b;//cannot access directly inside a main, we need to create an object and then access it inside main
    public static void main(String[] args) {
        int a=10; //inside main so it as called local variable
        Datatypes datatypes=new Datatypes();//creating the object
        System.out.println("a="+a);
        System.out.println("b="+datatypes.b);
        System.out.println(datatypes);//it will call the toString() method from Object class(Super class)
        
    }
}
