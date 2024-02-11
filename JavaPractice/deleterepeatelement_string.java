package JavaPractice;
import java.util.Scanner;
public class deleterepeatelement_string {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String:");
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
        int len=str.length();
        
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(ch[i]==ch[j]){
                    for(int k=j;k<len-1;k++){
                        
                        ch[k]=ch[k+1];
                    }
                    len--;
                    j--;

                }
            }
        }
        System.out.println("After the duplicate character:");
        for(int i=0;i<len;i++){
            System.out.println(ch[i]);
        }
}
    
}
