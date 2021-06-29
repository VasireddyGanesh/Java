import java.util.Scanner;

abstract class Figure_3D{
    public abstract double getSurfaceArea();
    public abstract double getVolume();
}

class Cylender extends Figure_3D{
    private double height;
    private double radius;  
    public Cylender(double height,double radius) {
        this.height=height;
        this.radius=radius;
    }   
    public double getSurfaceArea(){
        return (2*Math.PI*radius*height)+(2*Math.PI*Math.pow(radius, 2));
    }
    public double getVolume(){
        return Math.PI*Math.pow(radius, 2)*height;
    }
}

class Cone extends Figure_3D{
    private double radius;
    private double height;
    public Cone(double height,double radius) {
        this.height=height;
        this.radius=radius;
    }  
    public double getSurfaceArea(){
        return Math.PI*radius*(radius+(Math.sqrt(Math.pow(height, 2)+Math.pow(radius, 2))));
    }
    public double getVolume(){
        return (Math.PI*Math.pow(radius, 2)*height)/3;
    }
}

class Sphere extends Figure_3D{
    private double radius;
    public Sphere(double radius) {
        this.radius=radius;
    }
    public double getSurfaceArea(){
        return 4*Math.PI*Math.pow(radius, 2);
    }
    public double getVolume(){
        return (4*(Math.PI*Math.pow(radius, 3)))/3;
    }
}

class Test{
    public static void main(String[] args) {
        Figure_3D []arr=new Figure_3D[3];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Height and Radius of the Cylender : ");
        double height=s.nextDouble();
        double radius=s.nextDouble();
        arr[0]=new Cylender(height,radius);
        System.out.println("Enter Height and Radius of the Cone : ");
        height=s.nextDouble();
        radius=s.nextDouble();
        arr[1]=new Cone(height,radius);
        System.out.println("Enter Radius of the Sphere : ");
        radius=s.nextDouble();
        arr[2]=new Sphere(radius);
        System.out.println("Surface Area of Cylender "+arr[0].getSurfaceArea());
        System.out.println("Surface Area of Cone "+arr[1].getSurfaceArea());
        System.out.println("Surface Area of Sphere "+arr[2].getSurfaceArea());
        System.out.println("Volume of Cylender "+arr[0].getVolume());
        System.out.println("Volume of Cone "+arr[1].getVolume());
        System.out.println("Volume of Sphere "+arr[2].getVolume());
        s.close();
    }
}