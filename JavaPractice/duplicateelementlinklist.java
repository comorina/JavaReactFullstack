package JavaPractice;

public class duplicateelementlinklist {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next= null;
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
    public void removeduplicate(){
        Node current =head,index=null,temp=null;

        if(head==null){
            return;
        }
        else{
            while(current!=null){
                temp=current;
                index=current.next;
                while(index!=null){
                    if(current.data==index.data){
                        temp.next=index.next;
                    }
                    else{
                        index=index.next;
                    }
                    current=current.next;
                }
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
            System.out.println(current.data+"");    
            current=current.next;

        }
        System.out.println();
    }
    public static void main(String[] args) {
        duplicateelementlinklist list=new duplicateelementlinklist();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(2);
        list.addNode(2);
        list.addNode(4);
        list.addNode(1);
        System.out.println("Original list:");
        list.display();
        System.out.println("List after removing duplicates:");
        list.display();
        
    }
    
}
