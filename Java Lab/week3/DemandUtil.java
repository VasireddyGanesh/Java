import java.util.Scanner;

public class DemandUtil {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number of Years and IDs :");
        int years=s.nextInt();
        int ids=s.nextInt();
        int matrix[][]=new int[years+1][ids+1];
        matrix[0][0]=0;
        System.out.println("Enter the Years :");
        for(int i=1;i<=years;i++){
            matrix[i][0]=s.nextInt();
        }
        System.out.println("Enter the Ids :");        
        for(int j=1;j<=ids;j++){
            matrix[0][j]=s.nextInt();
        }
        for(int i=1;i<=years;i++){
            System.out.println("Enter the items Sold in the Year : "+matrix[i][0]);
            for(int j=1;j<=ids;j++){
                System.out.println("With Id : "+matrix[0][j]);
                matrix[i][j]=s.nextInt();
            }
        }
        int maxSold=0 ,maxSoldYear=0 , maxSoldId=0;
        for(int i=1;i<=years;i++){
            for(int j=1;j<=ids;j++){
                if(maxSold<matrix[i][j]){
                    maxSold=matrix[i][j];
                    maxSoldYear=i;
                    maxSoldId=j;
                }
            }
        }
        System.out.println("Year "+matrix[maxSoldYear][0] + " and id "+ matrix[0][maxSoldId] +" has more demand i.e "+matrix[maxSoldYear][maxSoldId]+" items");
        s.close();
    }
}
