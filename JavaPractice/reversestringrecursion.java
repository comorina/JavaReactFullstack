package JavaPractice;
import java.util.*;
public class reversestringrecursion {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        s=sc.nextLine();
        System.out.println("After the reverse string is:");
        for(int i=s.length();i>0;i--){
            System.out.print(s.charAt(i-1));
        }
        
    }
    
}
