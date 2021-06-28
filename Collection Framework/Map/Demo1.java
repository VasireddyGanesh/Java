import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        HashMap h=new HashMap();
        h.put("ravi",120);
        h.put("rahul",20);
        h.put("pavan",30);
        h.putIfAbsent("Alice", "200");
        System.out.println(h);
        Set s1=h.keySet();
        System.out.println(s1);
        Collection c=h.values();
        System.out.println(c);
        Set s2=h.entrySet();
        System.out.println(s2);
        Iterator itr= s2.iterator();
        while(itr.hasNext()){
            Map.Entry e=(Map.Entry)itr.next();
            System.out.println(e.getKey()+" : "+e.getValue());
        }
    }
}
