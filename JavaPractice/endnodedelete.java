package JavaPractice;

public class endnodedelete {
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
    Node newNode=new Node(data);
    if(head==null){
        head=newNode;
        tail=newNode;
    }
    else{
        tail.next=newNode;
        tail=newNode;
    }
}
public void deletefromend(){
    if(head==null){
        System.out.println("List is empty");
        return;
    }

else{
    if(head!=tail){
        Node current=head;
        while(current.next!=tail){
            current=current.next;
        }
        tail=current;
        tail.next=null;
    }
    else{
        head=tail=null;
    }
}

}
public void display(){
    Node current=head;
    if(head==null){
        System.out.println("List  is empty");
        return;
    }
    while(current!=null){
        System.out.println(current.data+ " ");
        current=current.next;
    }
    System.out.println();
}

    public static void main(String[] args) {
        endnodedelete list=new endnodedelete();
        list.addnode(1);
        list.addnode(2);
        list.addnode(3);
        list.addnode(4);
        System.out.println("Original List");
        list.display();
        while(list.head!=null){
            list.deletefromend();
            System.out.println("Update list:");
            list.display(); 
        }
    }
    
}
