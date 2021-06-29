import java.util.Scanner;

public class VowelsAndConsonents {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of Strings :");
        int strCount=s.nextInt();
        String str[]=new String[strCount];
        for(int i=0;i<strCount;i++){
            System.out.println("Enter String "+(i+1)+" : ");
            str[i]=s.next();
        }
        for(int j=0;j<strCount;j++)
        {
            int volCount=0;
            int constCount=0;
            for(int i=0;i<str[j].length();i++)
            {
                if(str[j].charAt(i)=='A'||str[j].charAt(i)=='E'||str[j].charAt(i)=='I'||str[j].charAt(i)=='O'||str[j].charAt(i)=='U'||str[j].charAt(i)=='a'||str[j].charAt(i)=='e'||str[j].charAt(i)=='i'||str[j].charAt(i)=='o'||str[j].charAt(i)=='u'){
                    volCount++;
                }else{
                    constCount++;
                }
            }
            System.out.println("In \""+str[j]+ "\" Number of Vowels is "+volCount+" and Number of Consonents is "+constCount);
        }
        s.close();
    }
}
