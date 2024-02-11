package JavaPractice;

public class oddevenmatrix {
    public static void main(String[] args) {
        int a[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int rows,cols,countOdd=0,countEven=0;
        rows=a.length;
        cols=a.length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(a[i][j]%2==0){
                    countEven++;
                }
                else{
                    countOdd++;
                }
            }
            
        }
        System.out.println("Freq of odd number:"+countOdd);
            System.out.println("Freq of even number:"+countEven);
    }
    
}
