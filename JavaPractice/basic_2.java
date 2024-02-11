package JavaPractice;
//Create a class sqaure with methid to initilize to its side,calculating area, perimeter  etc
public class basic_2 {
    static class square{
        int side;
        public int area (){
            return side*side;
        }
        public int perimeter(){
            return 4*side;
        }
    }
    public static void main(String[] args) {
        square sq= new square();
        sq.side=4;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
        
    }
    
}
