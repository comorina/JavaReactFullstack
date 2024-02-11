package JavaPractice;
import java.util.*;
public class wordbywordreverse {
    public static void main(String[] args) {
        wordbywordreverse rs=new wordbywordreverse();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println("Reverse of a String "+rs.reversestr(str));
    }
    static String reversestr(String s){
        String r="";
        for(int i=s.length();i>0;--i){
            r+=(s.charAt(i-1));

        }
        return r;
    }
    
}
