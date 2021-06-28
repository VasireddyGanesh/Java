import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo3 {
   public static void main(String[] args) {
    List<String> l=new ArrayList<String>();
    l.add("red");
    l.add("blue");
    l.add("green");
    l.add("pink");
    l.add("brown");
    if(l.contains("white")){
        System.out.println("Found");
    }else{
        System.out.println("Not Found");
    }
    Collections.sort(l);
    System.out.println(l);
   }
}
