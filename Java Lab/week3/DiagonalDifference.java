import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter order of matrix:");
        int n = s.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        int[][] a = new int[n][n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                a[i][j] = s.nextInt(); 
            }                
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                if (i == j)
                    sum1 += a[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                if ((i + j) == n - 1)
                    sum2 += a[i][j];
            }               
        }
        System.out.println("Difference is : " + Math.abs(sum1 - sum2));
        s.close();
    }
}
