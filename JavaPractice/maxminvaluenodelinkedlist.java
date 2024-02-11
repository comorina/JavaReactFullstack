package JavaPractice;

public class maxminvaluenodelinkedlist {
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
public void minNode(){
    Node current=head;
    int min;
    if(head==null){
    System.out.println("List is empty:");
}
else{
    min=head.data;

    while(current!=null){
        if(min>current.data){
            min=current.data;
        }
        current=current.next;
    }
    System.out.println("Minimun vlue node in the list:"+min);

}
}
public void maxNode(){
    Node current=head;
    int max;
    if(head==null){
        System.out.println("List is empty:");
    }
    else{
        max=head.data;
        while(current!=null){
            if(max<current.data){
                max=current.data;
            }
            current=current.next;
        }
        System.out.println("Max value of node:"+max);
    }
}
   public static void main(String[] args) {
    maxminvaluenodelinkedlist list =new maxminvaluenodelinkedlist();
       list.addNode(5);
       list.addNode(8);
       list.addNode(1);
       list.addNode(6);
       list.addNode(7);
       list.minNode();
       list.maxNode();
    }
    
}
