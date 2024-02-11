package JavaPractice;

public class allleavessamelevel {
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
    public static int level=0;
    public allleavessamelevel(){
        root=null;
    }
    public boolean inSameLevel(Node temp,int currentlevel){
        if(root==null){
            System.out.println("Tree is empty:");
            return true;
        }
        else{
            if(temp==null)
            return true;
            if(temp.left==null && temp.right==null){
                if(level==0)
                    level=currentlevel;
                    return true;
                }
                else{
                    return(level==currentlevel);
                }
                return(inSameLevel(temp.left, currentlevel + 1) && inSameLevel(temp.right, currentlevel + 1))
            }
        }

    

    public static void main(String[] args) {
        allleavessamelevel sc=new allleavessamelevel();
        sc.root=new Node(1);
        sc.root=new Node(2);
        sc.root=new Node(3);
        sc.root=new Node(4);
        sc.root=new Node(5);
        sc.root=new Node(6);
        if(sc.inSameLevel(sc.root,1)){
            System.out.println("All leave are at same level:");

        }
        else{
            System.out.println("All leave are not at same level");
        }
    }
    
}
