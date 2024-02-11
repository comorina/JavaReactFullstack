package JavaPractice;
import java.util.Scanner;
public class Vowel_Cons {
    public static void main(String[] args) {
        System.out.println("Enter Charc:");
        Scanner ef= new Scanner(System.in);
        char ch=ef.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch== 'I'|| ch== 'O' || ch=='U' ){
            System.out.println("Vowel");
        }
        else if((ch>='a' && ch<='z' )||(ch>='A' && ch>='Z')){
            System.out.println("Consonant");
        }
        else{
            System.out.println("Symbol:");
        }
        
    }
    
}
