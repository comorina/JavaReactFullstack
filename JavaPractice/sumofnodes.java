package JavaPractice;

public class sumofnodes {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }
    static class buildtree{
        static int idx=-1;
        public static Node buildTree(int[]node){
            idx++;
            if(node[idx]==-1){
                return null;
            }
            Node newnode=new Node(node[idx]);
            newnode.left=buildTree(node);
            newnode.right=buildTree(node);
            return newnode;
        }
    }
    public static int sumOfnodes(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=sumOfnodes(root.left);
        int rightSum=sumOfnodes(root.right);
        return leftSum+rightSum+root.data;
    }
    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}; 
        buildtree tree=new buildtree();
        Node root=tree.buildTree(node);
        System.out.println(sumOfnodes(root));
    }
    
}
