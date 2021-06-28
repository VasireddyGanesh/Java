class Student{
    private String name;
    private String course;
    public Student(String name,String course) {
        super();
        this.name=name;
        this.course=course;
    }
    public String toString(){
        return this.name + " : "+this.course;
    }
    public boolean equals(Object s){
        if(s==this) return true;
        try{
           Student s2=(Student)s;
           if(name.equals(s2.name) && course.equals(s2.course)){
            return true;
           }else{
            return false;
           }
        }catch(ClassCastException c){
            return false;
        }catch(NullPointerException n){
            return false;
        }       
    }
}


class StudentDemo{
    public static void main(String[] args) {
        Student s1=new Student("Bob","Btech");
        Student s2=new Student("Bob","Degree");
        System.out.println(s1.equals(s2));
    }
}