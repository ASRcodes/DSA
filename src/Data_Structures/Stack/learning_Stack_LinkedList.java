package Data_Structures.Stack;
// Implementation of stack through LinkedList
public class learning_Stack_LinkedList {
//    class for the node of LinkedList
    static class Node{
//        variable will store data
        int data;
//        variable for pointing next node
        Node next;
//        Constructor for initializing data
    public Node(int data){
        this.data = data;
        next = null;
    }
}
//Class for stack
    static class Stack{
//        last node of linked list The head of stack
    public static Node head;
//    If stack is empty we'll return head == null
    public static boolean isEmpty(){
        return head == null;
    }

//    Push operation
    public static void push(int data){
//        creating a new node for inserting the data
        Node newNode = new Node(data);
//        Assigning new Node as head
        if(isEmpty()){
            head = newNode;
            return;
        }
//        If there are already few elements then
//        Assigning the newNode's next element as head
        newNode.next = head;
//        And head will be assigned as new node
        head = newNode;
    }
    public static int pop(){
//        if stack is empty return -1;
        if (isEmpty()){
            return -1;
        }
//        Now creating a variable top which will be assigned with our head's data
        int top = head.data;
//        And then head will be assigned to the next head
        head = head.next;
        return top;
    }
//    peek()
    public static int peek(){
        if (isEmpty()){
            return -1;
        }
        return head.data;
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
