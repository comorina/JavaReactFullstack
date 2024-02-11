package JavaPractice;

public class m {
    static int logic(int x, int y){
       int z;
       if(x>y){
        z=x+y;
       }
       else{
        z=(x+y)*5;
       }
        return z;
    }
    public static void main(String[] args) {
        int a=5;
        int b=6;
        int c;
        
        c=logic(a,b);

        int a1=10;
        int a2=20;
        int c1;
        
        c1=logic(a1,a2);
        System.out.println(c);
        System.out.println(c1);
        
    }
}
