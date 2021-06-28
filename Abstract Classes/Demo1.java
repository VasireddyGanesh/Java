
abstract class person{
    String name;
    int age;
    person(String name,int age){
        this.name=name;
        this.age=age;
    }
} 

class Student extends person{
    private int RollNo;
    Student(String name,int age,int RollNo){
        super(name, age);
        this.RollNo=RollNo;
    }
    public void display(){
        System.out.println(name+" "+age+" "+RollNo);
    }
}

class Demo1{
    public static void main(String[] args) {
        Student s=new Student("ravi",30,19121);
        s.display();
    }
}
