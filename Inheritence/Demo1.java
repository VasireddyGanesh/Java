
public class Demo1 {
    Demo1(){
        System.out.println(this.hashCode());
    }
}

class Test1 extends Demo1 {
    Test1(){
        System.out.println(this.hashCode());
    }
}

class Test{
    public static void main(String[] args) {
        Test1 t=new Test1();
        System.out.println(t.hashCode());
    }
}
