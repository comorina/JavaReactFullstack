package JavaPractice;
import java.util.*;
class account{
    String name; // default access modifiers
    protected String email;//protected access modifiers
    private String password;
    // getter & setters
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pass){
        this.password=pass;

    }
}
public class packa_ge {
    public static void main(String[] args) {
        account acc1=new account();
        acc1.name="Vivek";
        acc1.email="vivak@gmail.com";
        acc1.setPassword("abcd");//wrong then use getter and setters
     acc1.setPassword(acc1.getPassword());
        
    }
    
}
