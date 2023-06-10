//Accessing Private Member

class Address{
    protected String location;
    protected int roadNo;
    protected int houseNo;

    protected void setLocation(){
        location = "sefat";
        roadNo = 432;
        houseNo = 345;
    }

    void Display(){
        System.out.println("Address- \n" + location);
        System.out.println("Road No: " + roadNo);
        System.out.println("House No: " + houseNo);
    }
}

public class Access_protected_member {
    public static void main(String[] args){
       Address s = new Address();
       s.setLocation();
       s.Display();
    }
}
