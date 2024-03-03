package Oops.Abstraction;

//       Encapsulation is used for data hiding. And in encapsulation data and function are combined in one class
//      In Abstraction we use to show only the imp and relevant data to user and hide remains..


// This Animal class is not necessary right now so we can make this class abstract
abstract class Animal{
//    We can make constructors for abstracted classes
    Animal(){
        System.out.println("This is Animal class's constructor");
    }
//    And this function is also not needed in much. We can create it abstracted also
    abstract void canWalk();
//    Here we can create non-abstract methods for abstract classes and call them for extended classes
    public void canEat(){
        System.out.println("All animals use to eat...");
    }
}
class Dog extends Animal{
    public void canWalk(){
        System.out.println("Walk on 4 legs...");
    }
}
class Hen extends Animal{
    Hen(){
        System.out.println("This is hen class's constructor");
    }
    public void canWalk(){
        System.out.println("Walk on 2 legs...");
    }
}


 class OOpsAbstract {
    public static void main(String[] args) {
        Dog dog = new Dog();
     Hen hen = new Hen();
//        We can't create objects of this class and call the functions because it's an abstracted class...
//        Animal animal = new Animal();
//        animal.canWalk();
    }
}
