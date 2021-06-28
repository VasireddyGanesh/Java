import java.util.HashSet;

public class Demo1 {
    public static void main(String[] args) {
        HashSet<String> s=new HashSet<String>();
        s.add("1");
        s.add("2");
        s.add("3");
        s.add("4");
        s.add("5");
        s.add("5");//returns false
        s.add(null);
        s.add(null);//returns false
        System.out.println(s);
    }
}
