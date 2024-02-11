package JavaPractice;
abstract class animal{
    abstract void walk();
    animal(){// constructor
        System.out.println("You are creating a new");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
    }
    class horse extends animal{
        horse(){// constructor
            System.out.println("Created a horse");
        }
        public void walk(){
            System.out.println("Walks on 4 legs");
        }
        public void eat(){
            System.out.println("Horse eat a Grass");
        }
    }
    class chicken extends animal{
            public void walk(){
                System.out.println("walk on 2 legs");
            }
        public void eat(){
            System.out.println("Chicken eat insect");
        }
    }


public class animal_wi {
    public static void main(String[] args) {
        horse hor1=new horse();
        hor1.walk();
        hor1.eat();
        chicken ch1=new chicken();
        ch1.walk();
        ch1.eat();
    }
    
}
