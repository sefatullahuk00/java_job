//Accessing Private Member

class Address{
    private String location;
    private int roadNo;
    private int houseNo;

    private void setLocation(String loc,int road, int house){
        location = loc;
        roadNo = road;
        houseNo = house;
    }

    void Display(String loc,int road, int house){
        setLocation(loc,road,house);
        System.out.println("Address- \n" + location);
        System.out.println("Road No: " + roadNo);
        System.out.println("House No: " + houseNo);
    }
}

public class Access_private_member {
    public static void main(String[] args) throws Exception {
       Address s = new Address();
       s.Display("Rajapalong, Ukhia",143,3937);
       System.out.println();
       s.Display("Rajapalsdfong, Ukhia",1433,393437);
       System.out.println();
       s.Display("Palongkhali, Ukhia",5443,75488);
    }
}
