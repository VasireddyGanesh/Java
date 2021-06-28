import java.util.*;

class Demo1{
    public static void main(String[] args) {
        List l=new ArrayList();
        l.add("1");
        l.add("2");
        l.add("3");
        l.add("4");
        Iterator itr=l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}