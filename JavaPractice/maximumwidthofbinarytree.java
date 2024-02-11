package JavaPractice;
import java.util.LinkedList;
import java.util.Queue;
public class maximumwidthofbinarytree {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }
    public Node root;
    public maximumwidthofbinarytree (){
        root =null;
    }
    public int findmaxwidth(){
        int maxwidth=0;
        int nodesinLevl=0;
        Queue<Node> queue=new LinkedList<Node>();
        if(root==null){
            System.out.println("Tree is empty");
            return 0;
        }
        else{
            queue.add(root);
            while(queue.size()!=0){
                nodesinlevel=queue.size();
            }
        }
    }
    public static void main(String[] args) {
        
    }
    
}
