import java.util.Scanner;

public class Box {
    private final double width;
    private final double height;
    private final double depth;
    public Box(Double width,Double height,Double depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    public double getVolume(){
        return width*height*depth;
    }
}


class test{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Width of Box :");
        double width=s.nextDouble();
        System.out.println("Enter Height of Box :");
        double height=s.nextDouble();
        System.out.println("Enter Depth of Box :");
        double depth=s.nextDouble(); 
        Box b=new Box(width,height,depth);
        System.out.println("Volume of the Box is "+ b.getVolume());
        s.close();
    }
}