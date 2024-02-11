package JavaPractice;

public class palindrome_linkedlist {
    class Node{
        int data;
        Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
    }
    public int size;
    public Node head=null;
    public Node tail=null;

public void addNode(int data){
    Node newNode=new Node(data);

    if(head==null){
        head=newNode;
        tail=newNode;
    }
else{
    tail.next=newNode;
    tail=newNode;
}
size++;
}
public void reverseList(Node temp){
    Node current=temp;
    Node preNode=null,nextNode=null;
    while(current!=null){
        nextNode=current.next;
        current.next=preNode;
        preNode=current;
        current=nextNode;
    }
    return preNode;
}
public void isPalidrome(){
    Node current=head;
    boolean flag=true;
    int mid=(size%2==0)?(size/2):(size+1)/2;

    for(int i=1;i<mid;i++){
        current=current.next;
    }
    Node revHead=reverseList(current.next);
    while(head!=null && revHead!=null){
        if(head.data!=revHead.data){
            flag=false;
            break;
        }
        head=head.next;
        revHead=revHead.next;
    }
    if(flag){
        System.out.println("Given singly linked list is palindomre");
        else{
            System.out.println("Given singly  linked list not a palindrome:");
        }
    public void display(){
        Node current=head;
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        System.out.println("Node of singly linkedlist:");
        
        while(current!=null){
            System.out.println(current.data+ "");
            current=current.next;

        }
        System.out.println();
    
}
 public static void main(String[] args) {
     Palidrome list=new  Palidrome();
    }
    
}
