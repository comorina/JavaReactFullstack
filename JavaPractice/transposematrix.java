package JavaPractice;

public class transposematrix {
    public static void main(String[] args) {
        int rows,cols;
        int a[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        rows=a.length;
        cols=a.length;
        int t[][]=new int[rows][cols];

        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++){
                t[i][j]=a[j][i];
            }

        }
        System.out.println("Transpose of the given matrix:");
        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++){
             System.out.print(t[i][j]+ " ");
            }
            System.out.println();

        }
    }
    
}
