package JavaPractice;

public class bit_operationclear {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitMask=1<<pos;
        int notbitMask= ~(bitMask);
        int newnum=notbitMask & n;
        System.out.println(newnum);
    }
    
}
