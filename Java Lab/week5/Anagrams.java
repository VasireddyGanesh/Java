import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str1 = s.next();
        System.out.println("Enter another String :");
        String str2 = s.next();
        if (str1.length() != str2.length()) {
            System.out.println(str1 + " and " + str2 + " are Not Anagrams");
        } else {
            char[] chArr1 = str1.toLowerCase().toCharArray();
            char[] chArr2 = str2.toLowerCase().toCharArray();
            Arrays.sort(chArr1);
            Arrays.sort(chArr2);
            if (Arrays.equals(chArr1, chArr2)) {
                System.out.println(str1 + " and " + str2 + " are Anagrams");
            } else {
                System.out.println(str1 + " and " + str2 + " are Not Anagrams");
            }
        }
        s.close();
    }
}
