package Data_Structures.LinkedList;
import java.util.*;
import java.util.LinkedList;

public class LLCollectionFramWorks {
    public static void main(String args[]){
        LinkedList<String > list = new LinkedList<>();
        list.addFirst("Hi");
        list.addLast("I");
        list.addLast("am");
        list.addLast("Anubhav");

        System.out.println(list);
        for (int i =0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("Null");

        list.remove(3);
        System.out.println(list);
    }
}
