package JavaPractice;
// print the sum of the first n natrual number through recursion
public class apnaColl_re2 {
    public static void printsum(int i,int n, int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
       sum+=i;
        printsum(i+1,n,sum);
        System.out.println(i );

    }
    public static void main(String[] args) {
       printsum(1,5,0);
        
    }
    
}
