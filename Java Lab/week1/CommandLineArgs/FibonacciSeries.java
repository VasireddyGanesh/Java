class FibonacciSeries{
  public static void main(String[] args) {
      int num1=0;
      int num2=1;
      int n=Integer.parseInt(args[0]);
      n-=2;
      System.out.print(num1 + " "+ num2+" ");
      while(n-->0){
            int temp=num2;          
            num2=num2+num1;
            num1=temp;
            System.out.print(num2+" ");
      }
  }   
}