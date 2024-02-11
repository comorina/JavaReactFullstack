package JavaPractice;
import java.util.*;
public class reversew_strng {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int reverse=0;
        while (n!=0) {
            int remainder=n%10;
            reverse=reverse*10+remainder;
            n=n/10;
        }
        System.out.println("The reverse of the given num is:" +reverse);
    }
    
}
