package Oops.Static;
//        STATIC :- static keyword is use to give a fixed value once which can by changed from one place
class Anubhav{
    String name;
    static String profession;
}
public class OOPsStatic {
    public static void main(String[] args) {
        Anubhav.profession = "Android developer";
        Anubhav anubhav = new Anubhav();
        anubhav.name = "Raj";
        System.out.println(Anubhav.profession);
    }
}
