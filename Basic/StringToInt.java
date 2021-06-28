import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s =sc.next();
        int i=Integer.parseInt(s);
        System.out.println(i*3);
        sc.close();
    }
}
