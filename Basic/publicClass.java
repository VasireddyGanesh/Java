public class publicClass {
    public static void test(){
        System.out.println("TEST METHOD");
    }
}

class Test{
    public static void main(String[] args) {
        publicClass.test();
    }
}
