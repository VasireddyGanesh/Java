import java.util.Scanner;

class InputLine{
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
		    float b=sc.nextFloat();
		    long c=sc.nextLong();
		    byte d=sc.nextByte();
		    String s =sc.nextLine();
		    System.out.println(a);
		    System.out.println(b);
		    System.out.println(c);
		    System.out.println(d);
		    System.out.println(""+s);
			sc.close();
    }
}