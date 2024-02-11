package JavaPractice;
import java.util.Scanner;
public class prim_m{
    public static void main(String[] args) {
        int num; int count=0;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for(int i=2;i<num;i++){
            if(num%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Prime Number:");
        }
        else{
            System.out.println("Not a Prime Number:");
        }
    }
    
}
