package Oops;
//                                               Inheritance
//class Circle{
//    String color;
//}
//class Rectangle extends Circle{
////    Now here this class inherits the circle class we can easily use the properties of circle class here
//    public void printFun(){
//        System.out.println(this.color);
//    }
//}

// Types of inheritance......
//Single level inheritance
class Shape{
    public void area(){
        System.out.println("This class prints area of different shapes");
    }
}
class triangle extends Shape{
    public void area(int l,int b){
        System.out.println(1/2*l*b);
    }
}
//multi level inheritance....
class equilateralTriangle extends triangle{
    public void area(int l,int b){
        System.out.println(1/2*l*b);
    }
}

//Hierarchical inheritance....
//The type of inheritance in which there is only one base class and from that further classes are inherited
class Circle extends Shape{
    public void area(int r) {
        System.out.println(3.14*r*r);
    }
}

//4th type we have Hybrid inheritance
//when two or more types of the inheritance are present in a single class

public class OOP2 {
    public static void main(String[] args) {
//        Rectangle rec = new Rectangle();
//        rec.color = "Green";
//
//        rec.printFun();
    }
}
//                                    We Have learnt access modifiers in Bank package