import java.util.Scanner;

public class OddAndPrime {
    public static Boolean isPrime(int x){
            if(x<=1) return false;
            for(int i=2;i<=Math.sqrt(x);i++){
                if(x%i==0){
                    return false;
                }
            }
            return true;
    }
    public static Boolean isOdd(int x){
            if(x%2==0){
                return false;
            }else{
                return true;
            }
    }
    public static void main(String[] args) {
        Boolean flag=false;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of Elements in the Array :");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements of the Array :");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.print("Both Prime and Odd Integers are  ");
        for(int i=0;i<n;i++){
            if(isPrime(arr[i]) && isOdd(arr[i])){
                System.out.print("\n"+arr[i]);
                flag=true;
            }
        }
        if(!flag){
            System.out.print("Not Found !");
        }
        s.close();              
    }
}
