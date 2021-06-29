import java.util.Scanner;

public class ConvertTime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Hours : ");
        int hours=s.nextInt();
        System.out.println("Enter Minutes : ");
        int mins=s.nextInt();
        System.out.println("Enter Seconds :");
        int secs=s.nextInt();
        System.out.println("Enter AM or PM :");
        String meridiem=s.next().toUpperCase();
        if(hours >12 || mins > 59 || secs > 59){
            System.out.println("Please Enter Valid TIme");
        }else{
            if(hours==12 && mins>=0 && secs >=0 ){
                if(hours==12 && mins>=0 && secs>=0 && meridiem.equals("AM")){
                    hours-=12;
                    System.out.println("Entered Time in 24 Hour Time-Zone is "+hours + " : "+mins +" : "+secs);
                }else if(hours==12 && mins>=0 && secs>=0 && meridiem.equals("PM")){
                    System.out.println("Entered Time in 24 Hour Time-Zone is "+hours + " : "+mins +" : "+secs);
                }
            }
            else if(meridiem.equals("PM"))
            System.out.println("Entered Time in 24 Hour Time-Zone is "+(hours+12)+ " : "+mins +" : "+secs);
            else{
            System.out.println("Entered Time in 24 Hour Time-Zone is "+hours + " : "+mins +" : "+secs);    
            }
        }
        s.close();
    }
}
