package JavaPractice;

public class LINKDLIST {
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null; 
        }
    }
    public void addfirst(String data){
        Node newNode=new Node(data);
         if(head==null){
            head=newNode;
            return;
         }
        newNode.next=head;
        head=newNode;       
    }
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void printlist(){
        Node currNode=head;
        while(currNode.next!=null){
            System.out.println(currNode.data+ "->");
            currNode=currNode.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        LINKDLIST list=new LINKDLIST();
        list.addfirst("a");
        list.addfirst("is");
        list.printlist();
        list.addLast("List");
        list.printlist();
        list.addfirst("this");
        list.printlist();
    }
    
}
