package JavaPractice;
// print the numbers from 5 to 1 through recursion
public class apnacollege_recursion {
 public static void printnum(int n){
        if(n==0){
            return;
    }
    System.out.println(n);
    printnum(n-1);

}
public static void main(String[] args) {
    int n=5;
    printnum(n);
    
}   
} 

