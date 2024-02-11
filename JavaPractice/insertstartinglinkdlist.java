package JavaPractice;

public class insertstartinglinkdlist {
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
public void addAtfirst(int data){
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
    System.out.println("Adding the nodes to start of the list:");
    while(current!=null){
        System.out.println(current.data+"");
        current=current.next;
    }
    System.out.println();
}
  public static void main(String[] args) {
    insertstartinglinkdlist list=new insertstartinglinkdlist();
     list.addAtfirst(1);
     list.display();
     list.addAtfirst(2);
     list.display();
     list.addAtfirst(3);
     list.display();
     list.addAtfirst(4);
     list.display();
  }    
}
