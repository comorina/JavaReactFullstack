package JavaPractice;

public class longestrepeatingstring {
    public static String lcr(String s,String t){
        int n=Math.min(s.length(),t.length());
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=t.charAt(i)){
                return s.substring(0, i);

            }

        }
        return s.substring(0, n);
    }
    public static void main(String[] args) {
        String str1="Abcccdadfesgffr";
        String str2="";
        int n=str1.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                String x=lcr(str1.substring(i,n),str1.substring(j,n));
                if(x.length()>str2.length()){
                    str2=x;
                }

            }
            System.out.println("Longest repeating  sequance:"+str2);
        }
        
    }
    
}
