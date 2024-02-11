package JavaPractice;

public class apnacollege_re3 {
    public static int printfact(int n){
        if(n==1 ||n==0){
            return 1;
        }
        int fac_num=printfact(n-1);
        int fac_num1=n*fac_num;
        return fac_num1;
        

    }
    public static void main(String[] args) {
        int n=5;
       int ans=printfact(n);
       System.out.println(ans);
        
       
    }
    
}
