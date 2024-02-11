package JavaPractice;
// create a class ceelphone with methods to print "ringing....","Vibrating....." etc.
public class basic_1 {
   static class cellphone{
        public void ring(){
            System.out.println("Ringing.....");
        }
        public void Vibrate(){
            System.out.println("Vibrating.....");
        }
        public void callFriend(){
            System.out.println("Calling Vivek");
        }
    }
        public static void main(String[] args) {
            cellphone asus=new cellphone();
            asus.callFriend();
            asus.Vibrate();
            asus.ring();
       
        
        }
    }
    

    

