package JavaPractice;
//time complexity=O(n*n!)

public class apnacollege_backtracking {
        public static void printpermutation(String str, String perm,int indx ){
            if(str.length()==0){
            System.out.println(perm);
            return;
            
            }
                for(int i=0;i<str.length();i++){
                    char currchar=str.charAt(i);
                    String newstr=str.substring(0,i) + str.substring(i+1);
                    printpermutation(newstr, perm+currchar, indx+1);
                }
        }
    public static void main(String[] args) {
        String str ="ABC";
        printpermutation(str, "", 0);
        
    }
        
    }    

