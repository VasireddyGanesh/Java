import java.util.Scanner;

public class Calculator {
    private static int count=0;
    public Calculator() {
        count++;
    }
    public static int powerInt(int num1,int num2){
        return (int)Math.pow(num1,num2);
    }
    public static double powerDouble(double num1,double num2){
        return Math.pow(num1, num2);
    }
    public static int getObjectCount() {
        return count;
    }
}

class Calcytest{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter an Integer Number :");   
        int num=s.nextInt();
        System.out.println("Enter an Integer power to the Number :");
        int pow=s.nextInt();
        System.out.println("Enter a Double Data Type Number :"); 
        double num2=s.nextDouble();
        System.out.println("Enter an Double data type power to the Number :");
        double pow2=s.nextDouble();
        System.out.println("Result of "+num+" to the power of "+pow+" is : "+Calculator.powerInt(num, pow));
        System.out.println("Result of "+num2+" to the power of "+pow2+" is : "+Calculator.powerDouble(num2, pow2));
        System.out.println("Number of Calculator Objects created is : "+Calculator.getObjectCount());
        s.close();
    }
}
