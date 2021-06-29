import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Size :");
        int len=s.nextInt();
        int arr[]=new int[len];
        System.out.println("Enter the Elements :");
        for(int i=0;i<len;i++){
            arr[i]=s.nextInt();
        } 
        for(int i=0;i<len;i++){
            if(arr[i]>=Byte.MIN_VALUE && arr[i]<=Byte.MAX_VALUE ){
                System.out.println(arr[i] + " : Byte");
            }else if(arr[i]>=Short.MIN_VALUE && arr[i]<=Short.MAX_VALUE){
                System.out.println(arr[i] + " : Short");
            }else if(arr[i]>=Integer.MIN_VALUE && arr[i]<=Integer.MAX_VALUE){
                System.out.println(arr[i] + " : Int");
            }else{
                System.out.println(arr[i] + " : Long");
            }
        }
        s.close();
    }
}
