package JavaPractice;

public class smallestelementtree {
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
    public smallestelementtree(){
        root=null;
    }
    public int smalllestElement(Node temp){
        if(root==null){
            System.out.println("Tree is empty");
            return 0;

        }
        else{
            int leftmin,rightmin;
            int min=temp.data;
            if(temp.left!=null){
                leftmin=smalllestElement(temp.left);
                min=Math.min(min,leftmin);
            }
            if(temp.right!=null){
                rightmin=smalllestElement(temp.right);
                min = Math.min(min, rightmin);  

            }
            return min;
        }
    }
    public static void main(String[] args) {
        smallestelementtree sc=new smallestelementtree();
        sc.root=new Node(4);
        sc.root=new Node(2);
        sc.root=new Node(3);    
        sc.root=new Node(1);
        sc.root=new Node(5);
        sc.root=new Node(6);
        System.out.println("Smallest element in the binary tree:" +sc.smalllestElement(sc.root));

        
    }
    
}
