package Data_Structures.Stack;

import java.util.ArrayList;

public class learning_stack_ArrayList {
    static class Stack{
//        creating new arrayList
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
//            removing last element of array list which is the top element of stack
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }

    }
    public static void main(String args[]){
// create class's obj to call function
        Stack s = new Stack();
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
