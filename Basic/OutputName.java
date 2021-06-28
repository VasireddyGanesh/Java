import java.util.Scanner;

public class OutputName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name :");
        String name=sc.next();
        System.out.println("Hello \n"+name);
        sc.close();
    }
}
