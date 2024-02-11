package JavaPractice;

public class swap_num {
    public static void main(String[] args) {
        // Without using temporary num swap two num
        int a=20;
        int b=30;
        System.out.println("Before Swap:");
        System.out.println("a = "+a);
        System.out.println("a = "+b);
        b=b+a;
        a=b-a;
        b=b-a;
        System.out.println("Swap:");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

      
    }
    
}
