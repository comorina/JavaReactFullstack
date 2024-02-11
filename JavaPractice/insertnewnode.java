package JavaPractice;

public class insertnewnode {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    public Node head=null;
    public Node tail=null;
public void addAtEnd(int data){
    Node newnode=new Node(data);
    if(head==null){
        head=newnode;
        tail=newnode;

    }
    else{
        tail.next=newnode;
        tail=newnode;
    }
}
public void display(){
    Node current=head;
    if(head==null){
        System.out.println("List is empty:");
        return;
    }
    System.out.println("Adding nodes to end of the list:");
    while(current!=null){
        System.out.println(current.data+"");
        current=current.next;
    }
    System.out.println();
}
    public static void main(String[] args) {
        insertnewnode list=new insertnewnode();
        list.addAtEnd(1);
        list.display();
        list.addAtEnd(2);
        list.display();
        list.addAtEnd(3);
        list.display();
        list.addAtEnd(4);
        list.display();
    }
    
}
