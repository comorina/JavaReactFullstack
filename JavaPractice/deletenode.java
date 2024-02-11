package JavaPractice;

public class deletenode {
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

public void addnode(int data){
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
    public void deletefromstart(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        else{
            if(head!=tail){
                head=head.next;
            }
        else{
            head=tail=null;
        }
        }
}
public void display(){
    Node current=head;
    if(head==null){
        System.out.println("List is empty");
        return;
    }
    while(current!=null){
        System.out.println(current.data+ " ");
        current=current.next;
    }
    System.out.println();
}
    public static void main(String[] args) {
        deletenode list=new deletenode();
        list.addnode(1);
        list.addnode(2);
        list.addnode(3);
        list.addnode(4);
        System.out.println("Original List:");
        list.display();
        while(list.head!=null){
            list.deletefromstart();
            System.out.println("Update list:");
            list.display();
        }
    }
    
}
