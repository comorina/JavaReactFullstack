package JavaPractice;
import java.util.Scanner;
public class duplicatechar {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String:");
        int count =0;
        String str=sc.nextLine();
        char[] chars=str.toCharArray();
        System.out.println("Duplicate String:");
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                 if(chars[i]==chars[j]){
                    System.out.println(chars[j]);
                    count++;
                    break;
                 }
            }
        }
    }
    
}
