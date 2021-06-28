import java.util.*;
class Demo3{
    
    // Function to take input using Scanner class
    public static void main(String []arr){
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    // Your code here
		    int a=sc.nextInt();
		    float b=sc.nextFloat();
		    long c=sc.nextLong();
		    byte d=sc.nextByte();
		    String s =sc.nextLine();
		    System.out.println(a);
		    System.out.println(b);
		    System.out.println(c);
		    System.out.println(d);
		    System.out.print(s);
		}
		
    }
}