//Accessing Private Member

class Address{
    public String location;
    public int roadNo;
    public int houseNo;

    
    public void setLocation(String loc,int road, int house){
        location = loc;
        roadNo = road;
        houseNo = house;
    }

    void Display(){
        System.out.println("Address- \n" + location);
        System.out.println("Road No: " + roadNo);
        System.out.println("House No: " + houseNo);
    }
}

public class Access_public_member {
    public static void main(String[] args){
       Address s = new Address();
       s.setLocation("Rajapalong, Ukhia",143,3937);
       s.Display();
    //    System.out.println();
    //    s.setLocation("Rajapalsdfong, Ukhia",1433,393437);
    //    System.out.println();
    //    s.setLocation("Palongkhali, Ukhia",5443,75488);
    }
}
