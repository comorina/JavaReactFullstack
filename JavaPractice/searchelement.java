package JavaPractice;

public class searchelement {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head= null;
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
    public void searchnode(int data){
        Node current =head;
        int i=1;
        boolean flag=false;
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            while(current!=null){
                if(current.data==data){
                    flag =true;
                    break;
                }
            }
        if(flag){
            System.out.println("Element is present in the list at the position:"+i);
        }
        else{
            System.out.println("Element is not present  in the list:");
        }
        }
    }
    public static void main(String[] args) {
        searchelement list=new searchelement();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.searchnode(2);
        list.searchnode(7);

        
    }
    
}
