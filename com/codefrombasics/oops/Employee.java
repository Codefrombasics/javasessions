package com.codefrombasics.oops;

public class Employee {
    int empId;
    String empName;
    String empAddress;

    public Employee() {
        empId=1001;
        empName="Basheer";
        empAddress="Hyderabad";

    }
    public Employee(int empId){
        this.empId=empId;
    }
                        //1009,"XYZ","India
    public Employee(int empId, String empName, String empAddress) {
        this(20);
//        this.empId = empId;
        this.empName = empName;
        this.empAddress = empAddress;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAddress='" + empAddress + '\'' +
                '}';
    }
    public void show(){
        System.out.println("from show()");
        System.out.println( "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAddress='" + empAddress + '\'');
    }
     void getData(){
        display(this);
        show();
    }
    void display(Employee currentObject){
        System.out.println(currentObject.empAddress+" "+currentObject.empId+" "+currentObject.empName);
    }
}
