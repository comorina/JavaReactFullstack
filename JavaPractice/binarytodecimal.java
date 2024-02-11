package JavaPractice;
public class binarytodecimal {
    public static int getDec(int n){
        int dec=0;
        int x=0;
        while(true){
            if(n==0){
                break;
            }else{
                int temp=n%10;
                dec+=temp*Math.pow(2,x);
                n=n/10;
                x++;
            }
        }
        return dec;
    }
    public static void main(String[] args) {
        
        System.out.println("decimal of 1010 is :"+getDec(1010));
        System.out.println("decimal of 1010 is :"+getDec(1111));
    }
    
}
