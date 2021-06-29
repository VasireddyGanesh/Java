import java.util.Scanner;

class PrintdiagonalElements{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("Enter order of the Square Matrix :");
        n=s.nextInt();
        int arr[]=new int[n*n];
        int index=0;
        System.out.println("Enter Elements of the square Matrix :");
        for(int i=0;i<n*n;i++){
                arr[index++]=s.nextInt();
        }
        index=0;
        System.out.println("Elements of the Leading diagonal are :");
        for(int i=0;i<n;i++){
            System.out.println(arr[index]);
            index+=(n+1);
        }
        s.close();
    }
}