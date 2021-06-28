import java.util.Stack;

public class Demo1 {
    public static void main(String[] args) {
        Stack<String> s=new Stack<String>();
        s.push("1");
        s.push("2");
        s.push("3");
        s.push("4");
        s.push("5");
        s.pop();
        s.pop();
        System.out.println(s+" peek : "+s.peek());
    }
}
