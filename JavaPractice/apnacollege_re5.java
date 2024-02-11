package JavaPractice;
//print x^n(Stack height=n)
public class apnacollege_re5 {
    public static int calcpower(int x,int n){
        if(n==0){  // base case 1
            return 1;
        }
        if (x==0) {  // base case 2
            return 1;
        }
            int xpownum1=calcpower(x,n-1);
            int xpown= x*xpownum1;
        return xpown;
    }

    public static void main(String[] args) {
        int n=5;
        int x=2;
        int ans =calcpower(x,n);
        System.out.println(ans);
        
    }
    
}
