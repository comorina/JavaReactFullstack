package JavaPractice;

public class middlenodeadd {
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

public void addnode(int data){
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
public void addinMid(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=newNode;
        tail=newNode;
    }
    else{
        Node temp,current;
        int count=(size%2==0)?(size/2):((size+1)/2);
        temp=head;
        current=null;

    for(int i=0;i<count;i++){
        current=temp;
        temp=temp.next;
    }
    current.next=newNode;
    newNode.next=temp;
    }
    size++;
}
public void display(){
    Node current =head;
    if(head==null){
        System.out.println("List is empty:");
        return;
    }
    while(current!=null){
        System.out.println(current.data+ " ");  
        current=current.next;
    }
    System.out.println();
}
    public static void main(String[] args) {
        middlenodeadd  list=new middlenodeadd();
        list.addnode(1);
        list.addnode(2);
        list.addnode(3);
        list.addnode(4);
        System.out.println("Orignal list:");
        list.display();
        list.addinMid(5);
        System.out.println("Update list:");
        list.display();
        list.addinMid(6);
        System.out.println("Update list:");
        list.display();
        }

        
    }
    

