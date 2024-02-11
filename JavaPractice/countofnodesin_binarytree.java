package JavaPractice;

public class countofnodesin_binarytree {
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
        public static Node bulidTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newnode=new Node(nodes[idx]);
            newnode.left=bulidTree(nodes);
            newnode.right=bulidTree(nodes);
            return newnode;
        }
    }
    public static int countOfnodes(Node root){
        if(root==null){
            return 0;
        }
        int leftNodes=countOfnodes(root.left);
        int rightNodes=countOfnodes(root.left);
        
        return leftNodes+rightNodes+1;

    }
    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        buildtree tree=new buildtree();
        Node root=tree.bulidTree(node);
        System.out.println(countOfnodes(root));
        
    }
    
}
