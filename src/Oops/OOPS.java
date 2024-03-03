package Oops;
class pen{
    String style;
    String color;

    public static void write(){
        System.out.println("Writing from the pen.....");
    }
    public void penColor(){
        System.out.println(this.color);
    }
}
class Student{
    String name;
    int roll;

//    public void studentInfo(){
//        System.out.println(this.name);
//        System.out.println(this.roll);
//    }

//    Non- parameterize constructor .........
//    Student(){
////        Whenever an object of this class is created this constructor will be called....
//        System.out.println("Constructor called......");
//    }

//    Parameterize constructor..........
//    Student(String name,int roll){
//        this.name = name;
//        this.roll = roll;
//    }

//    Copy constructor
//    This constructor is copying the values of s1 inside s2......
//    Student(Student s2){
//        this.name = s2.name;
//        this.roll = s2.roll;
//    }
//    Student(){}



//    polymorphism --> Polymorphism is a concept in which we call or create
//    same kind of function more then one time with different functionality this is also called method overloading

//    Here we'll create functions with same names but with different functionality
//    public void studentInfo(String name){
//        System.out.println(this.name);
//    }
//    public void studentInfo(int roll){
//        System.out.println(this.roll);
//    }
//    public void studentInfo(String name,int roll){
//        System.out.println(this.name);
//        System.out.println(this.roll);
//    }

}
public class OOPS {
    public static void main(String[] args) {
//        pen pen1 = new pen();
//        pen pen2 = new pen();
//        pen2.color = "Black";
//        pen1.style = "Ball";
//        pen1.color = "Blue";
//        pen1.write();
//        pen1.penColor();
//        pen2.penColor();

//    Student student = new Student();
//    student.name = "Anubhav";
//    student.roll = 23;
//
//    Student student2 = new Student();
//    student2.name = "Raj";
//    student2.roll = 26;
//
//    student.studentInfo();
//    student2.studentInfo();

//        Objects with value in a constructor.......
//        Student student =  new Student("Anubhav",45);
//        student.studentInfo();

//        for copy constructor first create s1 from which we'll copy the values
//        Student s1 = new Student();
//        s1.name = "Anubhav";
//        s1.roll = 78;
//
////        Obj of copy constructor.....
//        Student s2 = new Student(s1);
//        s2.studentInfo();

//        Polymorphism objects...
//        Student s1 = new Student();
//        s1.name = "Anubhav";
//        s1.roll = 90;
//
//        s1.studentInfo(s1.name);
//        s1.studentInfo(s1.roll);
//        s1.studentInfo(s1.name, s1.roll);



    }
}
