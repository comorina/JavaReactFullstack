package JavaPractice;

import java.util.List;

public class countnode {
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
public void addNode(int data){
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
public int countnode(){
    int count=0;
    Node current =head;
    while(current!=null){
        count++;
        current=current.next;
    }
    return count ;
}
public void display(){
    Node current=head;
    if(head==null){
        System.out.println("List the empty");
        return;
    }
    System.out.println("Nodes of singely  linked List:");
    while(current!=null){
        System.out.println(current.data+ " ");
        current=current.next;
    }
    System.out.println();
}
    public static void main(String[] args) {
        countnode list=new countnode();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        

        list.display();
        System.out.println("Count of nodes in the list: " +list.countnode());

        
    }
    
}
