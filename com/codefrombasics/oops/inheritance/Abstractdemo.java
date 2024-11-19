package com.codefrombasics.oops.inheritance;
abstract class Shape{
    String color;
    //abstract method
    abstract double area();
    //concrete method
    public String getColor(){
        return color;
    }
}
class Circle extends Shape{
    double radius;
    public Circle(String color,double radius){
        this.color=color;
        this.radius=radius;
    }

    @Override
    double area() {
        return Math.PI*radius*radius;
    }
}

class Rectangle extends Shape{
double length,width;
public Rectangle(String color,double length, double width){
    this.color=color;
    this.length=length;
    this.width=width;
}
    @Override
    double area() {
        return length*width;
    }
}
public class Abstractdemo {
    public static void main(String[] args) {
        Circle circle=new Circle("Blue",9);
        Rectangle rectangle=new Rectangle("Green",8,9);
        System.out.println("Area of circle "+circle.area());
        System.out.println("Area of rectangle "+rectangle.area());

    }
}
