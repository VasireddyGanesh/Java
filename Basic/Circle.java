public class Circle {
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    double getArea(){
        return 2*3.14*(radius*radius);
    }
    double getPerimeter(){
        return 2*3.14*radius;
    }
}

class ComputeCircle{
    public static void main(String[] args) {
        Circle c = new Circle(2.5);
        System.out.println("Area is "+c.getArea());
        System.out.println("Perimeter is "+c.getPerimeter());
    }
}
