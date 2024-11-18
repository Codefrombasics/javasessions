package com.codefrombasics.oops.inheritance;
class Employee{
    int empId;
    String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }
}
class PermenantEmployee extends Employee{
    int pfNumber;
    public PermenantEmployee(int empId, String name,int pfNumber) {
        super(empId, name);
        this.pfNumber=pfNumber;
    }
    void permenantEmpDetails(){
        System.out.println(empId+ " "+pfNumber+" "+name);
    }
}

class ConstractEmployee extends Employee{
    int numberOfMonths;
    public ConstractEmployee(int empId, String name,int numberOfMonths) {
        super(empId, name);
        this.numberOfMonths=numberOfMonths;
    }

    void contractEmpDetails(){
        System.out.println(empId+ " "+numberOfMonths+" months"+name);
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        PermenantEmployee permenantEmployee=new PermenantEmployee(1001,"JKLM",87989798);
        permenantEmployee.permenantEmpDetails();
        ConstractEmployee constractEmployee=new ConstractEmployee(1002,"yuui",12);
        constractEmployee.contractEmpDetails();
    }
}
