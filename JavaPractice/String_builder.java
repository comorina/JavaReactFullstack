package JavaPractice;

public class String_builder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);
        //char at index 0
        System.out.println(sb.charAt(0));
        // set char at index
       sb.setCharAt(0, 'P');
       System.out.println(sb);
       //insert
       sb.insert(0, 'S');
       System.out.println(sb);
       //or
       sb.insert(3, 'n');
       System.out.println(sb);
       // delete
       sb.delete(3, 4);
       System.out.println(sb);
       // append
       sb.append("s");
       sb.append("t");
       sb.append("a");
       sb.append("r");
       sb.append("k");
       System.out.println(sb);
       System.out.println(sb.length());
    }
    
}
