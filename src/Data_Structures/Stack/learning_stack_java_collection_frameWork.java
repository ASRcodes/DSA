package Data_Structures.Stack;
import java.util.*;

public class learning_stack_java_collection_frameWork {
    public static void main(String args[]){
//        this comes under java collection frameWork
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

//        Now we'll run a loop which will return the elements in the stack until its empty
        while (!s.isEmpty()){
            System.out.println(s.peek());
//            poping the printed element to make the stack empty which will finally break the while loop
            s.pop();
        }
    }
}
