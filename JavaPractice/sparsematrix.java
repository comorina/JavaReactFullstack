package JavaPractice;

public class sparsematrix {
    public static void main(String[] args) {
        int rows,cols,size,count=0;
        int a[][]={
            {4,0,0},
            {0,5,0},
            {0,0,6}
    };
    rows=a.length;
    cols=a.length;
    size=rows*cols;

    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            if(a[i][j]==0){
                count++;
            }
        }

        if(count>(size/2)){
            System.out.println("Given the matrix is sparse:");

        }
        else{
            System.out.println("Given the matrix is sparse");
        }
    }
    }
    
}
