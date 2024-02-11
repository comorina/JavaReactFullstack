package JavaPractice;

public class variable_argument {
   // static int sum(int ...arr){
    static int sum(int x, int ...arr){
        int result=x;
        for(int a: arr){
            result +=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("welcome to varargs Tutorial");
        System.out.println("The sum of 4 and 5 is:" +sum(4,5));
        System.out.println("The sum of 3,4 and 5 is:" +sum(3,4,5));
        System.out.println("The sum of 3,4,5 and 6 is:" +sum(3,4,5,6));
        System.out.println("The sum of 3,4,5,6 and 7 is:" +sum(3,4,5,6,7));

    }
    
}
