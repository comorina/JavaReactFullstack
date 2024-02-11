package JavaPractice;
class employee1{
    int id;
    int salary;
    String name;
    public void printDetailes(){
        System.out.println("My id is:" +id);
        System.out.println("and my name is:" +name);
        System.out.println("My Salary: "+ salary);
    }
    public int getSalary(){
        return salary;
    }
}

public class oops {
public static void main(String[] args) {
    System.out.println("This is my Class");
    employee1 Vivek=new employee1();
    employee1 Shivam=new employee1();


    Vivek.id=12;
    Vivek.salary=0;
    Vivek.name="Vivek Pandey";
    int salary=Vivek.getSalary();
     

    Shivam.id=13;
    Shivam.salary=600000;
    Shivam.name="Shivam Pandey";
    int salary1=Shivam.getSalary();
     

     Vivek.printDetailes();
     Shivam.printDetailes();   
}    
}
