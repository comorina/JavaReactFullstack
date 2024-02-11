package JavaPractice;
import java.util.Scanner;
public class allsubset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String n=sc.nextLine();
        int len=n.length();
        int temp=0;
        String arr[]=new String[len*(len+1)/2];
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                arr[temp]=n.substring(i,j+1);
                temp++;
            }
        }
        System.out.println("All subsets for given string are:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
