import java.util.Arrays;

public class Rotatematrix {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
       
         for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=n/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;
            }
        }
      System.out.println(Arrays.deepToString(matrix));
    }
    public static void main(String[] args) {
        Rotatematrix rm=new Rotatematrix();
      int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
rm.rotate(matrix);
    }

}
