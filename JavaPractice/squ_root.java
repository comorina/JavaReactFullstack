package JavaPractice;
import java.util.Scanner;

public class squ_root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int temp;
        int sr=n/2;
        do{
            temp=sr;
            sr=(temp+(n/temp))/2;
        } while(temp-sr!=0);
        System.out.println("Sq root of the number :"+sr);
        
    }
    
}
