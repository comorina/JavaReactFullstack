package JavaPractice;
class cylinder{
    private int radius;
    private int height;
    public int getRadius(){
        return radius;
    }
    public void setRadius(int a){
        this.radius=a;
    }
    public int getheight(){
        return height;
    }
    public void setheight(int e){
        this.height=e;
    }
    public double surfaceArea(){
        return 2*3.14*radius*radius + 2*3.14*radius*height;

    }
    public double Volume(){
        return 3.14*radius*radius*height;
    }
}

public class cwh_44_exercise {
    // Create a class cylinder and use getters and setters to set its radius and height
    public static void main(String[] args) {
        cylinder mycylinder=new cylinder();
        mycylinder.setheight(12);
        
        System.out.println(mycylinder.getheight());
        mycylinder.setRadius(9);
        
        System.out.println(mycylinder.getRadius());
        System.out.println(mycylinder.surfaceArea());
        System.out.println(mycylinder.Volume());
        
        
    }
    
}
