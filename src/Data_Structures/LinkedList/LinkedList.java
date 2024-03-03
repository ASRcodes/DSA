package Data_Structures.LinkedList;
public class LinkedList {
    Node head;
    private int size;
    LinkedList(){
        this.size=0;
    }
    class Node{
//        Now we'll initialize two variables one for data and one for next node
        String data;
        Node next;
//        Making constructors for these for use them further
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
//    Adding  from first
    public void addFirst(String data){
//        Creating new node if the ll is empty
        Node newNode = new Node(data);
        if (head==null){
            head = newNode;
            return;
        }
//        if not empty then assigning the new node as head and assigning the previous node as the next node for new head
        newNode.next = head;
        head= newNode;
    }
//    Adding from the last node
    public void addLast(String data){
        //        Creating new node if the ll is empty
        Node newNode = new Node(data);
        if (head==null){
            head = newNode;
            return;
        }

//        For this we'll start traversing from the first node and we'll reach to the last and them will add it to the last
//        For that we'll create a variable for CurrentNode
        Node currNode = head;
        while (currNode.next!= null){
            currNode = currNode.next;
        }
//        Once we'll come out from the loop we'll be at the last element of the linkList
//        and once we reached there we'll add the given element there
        currNode.next = newNode;
    }
//    Now we'll make method for printing the LinkedList
    public void printLinkList(){
        Node currNode = head;
        while (currNode!= null){
//            We'll print value here
            System.out.print(currNode.data+ "->");
            currNode = currNode.next;
        }
//        once reached at last print null for last element
        System.out.println("Null");
    }
//    method for deletion
    public void firstDelete(){
        if (head==null){
            System.out.println("List empty");
            return;
        }
//        For determining the size
        size--;
//        And if not empty
        head = head.next;
    }
    public void lastDel(){
        if (head==null){
            System.out.println("List empty");
            return;
        }
        //        For determining the size
        size--;
//        If it's the last element simply delete it
        if (head.next==null){
            head = null;
            return;
        }
//        Making the 1st node as 2nd last node
        Node secondLast = head;
//        Making the 2nd node as last node
        Node lastNode = head.next;

        while (lastNode.next!=null){
//            Traversing both last and 2nd Last one by one
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
//        Once reached at second last delete it's next node
        secondLast.next = null;
    }
//    Method to return size
    public int sizeLL(){
        return size;
    }
    public static void main(String args[]){
//        Creating class's object
    LinkedList list = new LinkedList();
    list.addFirst("Anubhav");
    list.addFirst("Hehehe");
    list.addLast("yoYo");
    list.printLinkList();
    list.addLast("opop");
    list.printLinkList();
    list.firstDelete();
    list.printLinkList();
    list.lastDel();
    list.printLinkList();
        System.out.println(list.sizeLL());
        list.addFirst("Hi Bhai");
        System.out.println(list.sizeLL());
    }
}
