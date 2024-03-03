package Oops.Interfaces;

interface Animal{
//    We can't make methods & constructors for interface classes
    //    All fields in interface class are public,static and final by default..
int eyes = 2;
    public void canRun();
}
//                                    ONE vvip concept:- in JAVA multiple inheritance is done in interfaces
interface Carnivorous{}
class Chita implements Animal,Carnivorous{
    @Override
    public void canRun() {
        System.out.println("Runs fast.......");
    }
}

public class OOpInterFace {
    public static void main(String[] args) {
Chita chita = new Chita();
chita.canRun();
    }
}
