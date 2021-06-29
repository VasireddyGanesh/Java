import java.util.Scanner;

class ConcatenateStrings{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter First String : ");
        String s1=s.next();
        System.out.println("Enter Second String : ");
        String s2=s.next();
        System.out.println(s1+" and "+s2);
        s.close();
    }
}