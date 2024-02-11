package JavaPractice;
import java.util.Scanner;

public class reverse_num {
    public static void main(String[] arg){
	int num=2345;
    int reverse=0;
    while(num!=0){
        int reminder=num%10;
        reverse=reverse*10+ reminder;
        num=num/10;
    }
    System.out.println("The reverse of the given Number:" +reverse);
}
}
