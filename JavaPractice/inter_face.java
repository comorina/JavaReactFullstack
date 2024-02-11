package JavaPractice;
interface animall{
    void walk();
}
class horse implements animall{
   public void walk(){
    System.out.println("Walk on 4 legs");

    }
}

public class inter_face {
    public static void main(String[] args) {
        horse h1=new horse();
        h1.walk();
    }
    
}
