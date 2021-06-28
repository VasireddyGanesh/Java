import java.util.*;

public class Demo4 {
    public static void main(String[] args) {
        List<String> l1=new ArrayList<String>();
        l1.add("1");
        l1.add("2");
        l1.add("3");
        l1.add("4");
        l1.add("5");
        List<String> l2=new ArrayList<String>();
        l2.add("red");
        l2.add("blue");
        l2.add("green");
        l2.add("pink");
        l2.add("brown");
        Collections.copy(l1, l2);
        System.out.println("List-1 :"+l1);
        System.out.println("List-2 :"+l2);
        Collections.reverse(l1);
        System.out.println(l1);
        l1.clear();
        l2.clear();
        System.out.println(l1);
    }
}
