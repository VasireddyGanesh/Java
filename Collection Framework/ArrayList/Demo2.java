import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<String> l=new ArrayList<String>();
        l.add("Red");
        l.add("Blue");
        l.add("Green");
        l.add("pink");
        l.add("Brown");
        l.add(0,"Yellow");
        l.add(6,"Black");
        System.out.println(l);
        Iterator<String> itr=l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        l.set(2, "White");
        System.out.println(l.get(2));
        l.remove(6);
        for(String str:l){
            System.out.print(str+" ");
        }
    }
}
