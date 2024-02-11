package JavaPractice;

public class matchinterger_array {
    public static void main(String[] args) {
        int ar[] = {6,6,6,6,6,6};
    int matched = 1;
     
    for(int i=0;i<ar.length;i++){
        for(int j=(i+1);j<ar.length;j++){
            if(ar[i] == ar[j]){
                matched++;
                
                break;  
            }
        }
    
    } // End for loop
    System.out.println("Matched:"+(matched)+"");
           
}
}