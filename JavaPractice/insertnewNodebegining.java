package JavaPractice;

public class insertnewNodebegining {
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

public void addAtstrat(int data){
    Node newnode=new Node(data);

    if(head==null){
        head=newnode;
        tail=newnode;
    }
    else{
        Node temp=head;
        head=newnode;
        head.next=temp;
    }
}
public void display(){
    Node current=head;
    if(head==null){
        System.out.println("List is empty:");
        return;
    }
    System.out.println("Adding nodes to start of the list:");
    while(current!=null){
        System.out.println(current.data+" ");
        current=current.next;
    }
    System.out.println();
}
    public static void main(String[] args) {
        insertnewNodebegining list=new insertnewNodebegining();
        list.addAtstrat(1);
        list.display();
        list.addAtstrat(2);
        list.display();
        list.addAtstrat(3);
        list.display();
        list.addAtstrat(4);
        list.display();
        
    }
    
}
