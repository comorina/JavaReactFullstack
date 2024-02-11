package JavaPractice;
import java.util.*;
public class celcuisfarendite {
    public static void main(String[] args) {
        System.out.println("Program celcuis convert farenhite:");
        Scanner sc =new Scanner(System.in);
        System.out.println("Give the fahrenhite tempreture:");
        float fah=sc.nextFloat();
        float cel=((fah-32)*5)/9;
        System.out.println(cel);
    }
    
}
