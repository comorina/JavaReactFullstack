package JavaPractice;

public class pali_n {
    public static void main(String[] args) {
        int a; 
        int n=454;
        int sum=0;
        int temp;
          temp=n;
        while(n>0){
        a=n%10;
        sum=(sum*10)+a;
        n=n/10;
        }
    if(temp==sum){
        System.out.println("Palindrome Number");
    }
    else{
        System.out.println("Not Palindrome");
    }
    }
}
    

