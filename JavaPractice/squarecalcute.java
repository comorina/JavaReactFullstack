package JavaPractice;
import java.util.Scanner;
public class squarecalcute {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Print give the number calculate sqaure:");
        float num,sq;
         num=sc.nextFloat();
         sq=num*num;
         System.out.println("square of " +num+ ":");
         System.out.println(sq);
    }
    
}
