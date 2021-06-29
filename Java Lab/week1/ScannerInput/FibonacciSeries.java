import java.util.Scanner;

class FibonacciSeries{
  public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int num1=0;
      int num2=1;
      System.out.println("Enter Number of terms to print :");
      int n=s.nextInt();
      n-=2;
      System.out.print(num1 + " "+ num2+" ");
      while(n-->0){
            int temp=num2;          
            num2=num2+num1;
            num1=temp;
            System.out.print(num2+" ");
      }
      s.close();
  }   
}