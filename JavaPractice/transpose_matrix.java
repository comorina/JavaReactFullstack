package JavaPractice;

public class transpose_matrix {
    public static void main(String[] args) {
        int[][] orignal={{1,2,3},{3,4,5},{1,2,3}};
        int transpose[][]=new int[3][3];
        for( int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                transpose[i][j]=orignal[j][i];
            }
        }
        System.out.println("Prirnt matrix:");
        for( int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(orignal[i][j]+ "");
            }
            System.out.println();
        }
        System.out.println("Print matrix after transpose:");
        for( int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(transpose[i][j]+ "");
            }
            System.out.println();
        }
    }
    
}
