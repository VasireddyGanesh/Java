public class ConvertTime {
    public static void main(String[] args) {
        int hours=Integer.parseInt(args[0]);
        int mins=Integer.parseInt(args[1]);
        int secs=Integer.parseInt(args[2]);
        String meridiem=args[3].toUpperCase();
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
            System.out.println("Entered Time in 24 Hour Time-Zone is "+(hours+12) + " : "+mins +" : "+secs);
            else{
            System.out.println("Entered Time in 24 Hour Time-Zone is "+hours + " : "+mins +" : "+secs);    
            }
        }
    }
}
