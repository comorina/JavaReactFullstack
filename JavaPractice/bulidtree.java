package JavaPractice;
import java.util.*;
public class bulidtree {
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
    // public static void preorder(Node root){
    //     preorder(root.left);
    //     preorder(root.right);
    // }
    // public static void inorder(Node root){
    //     if(root==null){
    //         return;
    //     }
    //     inorder(root.left);
    //     System.out.println(root.data+" ");
    //     inorder(root.right);
    // }
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data+" ");
    }
    public static void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);    
        q.add(null);

        while(!q.isEmpty()){
            Node Currnode=q.remove();
            if(Currnode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                } else{
                    q.add(null);
                }
             } else{
                    System.out.print(Currnode.data+"");
                    if(Currnode.left!=null){
                        q.add(Currnode.left);
                    }
                    if(Currnode.right!=null){
                        q.add(Currnode.right);
                    }
                    }
                }
            
            }
        
    

    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        buildtree tree=new buildtree();
        Node root=tree.bulidTree(node);
      // System.out.println(root.data);
        postorder(root);
        levelOrder(root);
    }
    
}
