import java.util.Scanner;

public class Vehicle {
    private String vehicleType;
    public Vehicle(String vehicleType) {
        this.vehicleType=vehicleType;
    }
    public String getVehicleType(){
        return this.vehicleType;
    }
}

class Brand extends Vehicle{
    private String brand;
    public Brand(String brand,String vehicleType){
        super(vehicleType);
        this.brand=brand;
    }
    public String getBrand(){
        return this.brand;
    }
}

class Cost extends Brand{
    private long cost;
    public Cost(String vehicleType,String brand,long cost) {
        super(brand,vehicleType);
        this.cost=cost;    
    }
    public void getDetails(){
        System.out.println("Vehicle Details  : \nVehicle Type : "+getVehicleType()+"\nVehicle Brand  :   "+getBrand()+"\nVehicle Cost   :  "+this.cost);
    }
}

class Demo{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Vehicle type : ");
        String vehicleType=s.next();
        System.out.println("Enter Brand : ");
        String brand=s.next();
        System.out.println("Enter Cost : ");
        long cost=s.nextLong();
        Cost c=new Cost(vehicleType, brand, cost);
        c.getDetails();
        s.close();
    }
}
