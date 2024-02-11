package JavaPractice;
import java.util.*;
class binary{
    public int sqrt(int number){
        int low=0;
        int high=number;
        while(low<=high){
            int mid=(low+high)/2;
            int squ=mid*mid;
            if(squ==number){
                return mid;
            }
            else if(squ==number){
                low=mid+1;
            }
            else{
                high=mid+1;
            }
            }
            return 0;
        }
    }


public class binarysqaureroot {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        binary d=new binary();
        int result=d.sqrt(n);
        System.out.println("Sqaure root of  " +n+ " = " +result);
    }
    
}
