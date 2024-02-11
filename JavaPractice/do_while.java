package JavaPractice;
import java.util.Scanner;
public class do_while {
    public static void main(String[] args) {
      //  int num=0;
        //    do{
        //Scanner sc= new Scanner(System.in);
          //  num=sc.nextInt();
         //  System.out.print("Enter the number: ");
        //   System.out.println(num);
          //  }
           // while(num>=0);
          //  System.out.println("The End");
          
          // Break & Continue
          int i=0;
          while(true){
            if(i==3){
            i=i+1;
            continue; 
            }   
            System.out.println(i);
             i=i+1;
            if(i>5){
                break;
            }
          }
        }
    }

        
    
    

