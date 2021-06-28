package project1;

class Parent{
    public void fun2(){
        System.out.println("Fun2: ");
        fun();
    }
    public void fun(){
        System.out.println("Parent Class : Fun Method ");
    }
}

class Child extends Parent{
    public void fun(){
        System.out.println("Child Class : Fun Method ");
    }
    public void fun3(){
		System.out.println("Child Class : Fun3 ");
	}
}

public class Test {
    public static void main(String[] args) {
        Parent c=new Child();
        c.fun2();
		c.fun();
		c.fun3();
    }
}
