import java.util.Arrays;
import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=s.next();
        System.out.println("Enter the size to divide :");
        int n=s.nextInt();
        if(n>str.length() || n<=0){
            System.out.println("Please Enter Valid Size !");
        }else{
            String subStringArr[]=new String[str.length()-(n-1)];
            for(int i=0;str.length()/(i+n)>=1;i++){
                String temp=str.substring(i, i+n);
                subStringArr[i]=temp;
            }
            Arrays.sort(subStringArr);
            System.out.println("Lexicographical Order of Strings is "+Arrays.toString(subStringArr));
        }
        s.close();
    }
}