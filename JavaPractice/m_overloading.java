package JavaPractice;

public class m_overloading {
    static void foo(){
        System.out.println("Good Morning Bro");
    }
    static void foo(int a){
        System.out.println("Good Morning " + a + " Bro");
    }
    //static void change1(int [] arr){
       // arr[0]=98;
    
      //  static void telljokes(){
          //  System.out.println("I invented a new world!\n" + "Shivam BSDK");
        
         
    public static void main(String[] args) {
        //telljokes();
       
        // Case 1: Changing the integer
        //int x=45;
        //change(x);
        //System.out.println(x);
        
        // Case 2: Changing the Array
        // int[] marks={52,54,56,58,59};
          //  change1(marks);
           // System.out.println("Change the array number:"+marks[0]);

           // Method Overloading
           foo();
           foo(3000);
           

    }
    
}
