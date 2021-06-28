import java.util.Scanner;

public class ArthOpTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Number :");
        int num1 = sc.nextInt(); //Exception in thread "main" java.util.InputMismatchException
        System.out.println("Enter the Second Number :");
        int num2 = sc.nextInt();
        System.out.println(num1+num2+" is the Sum ");
        System.out.println(num1/num2+" is the Division");
        System.out.println(num1%num2+" is the Modulo Division");
        System.out.println("Subtraction is "+(num1-num2));
        System.out.println("Product is "+num1*num2);
        sc.close();
    }   
}
