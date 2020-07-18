package test;


public class persontest {

    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private int zip;
    private long phoneNumber;



    //Constructor
    public persontest() {
        this.firstName=firstName;
        this.lastName=lastName;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phoneNumber=phoneNumber;
    }
    public persontest(String firstName, String lastName, String city, String state, int zip, long phoneNumber){
        this.firstName=firstName;
        this.lastName=lastName;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phoneNumber=phoneNumber;
    }
    //Getter Methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }


    @Override
    public String toString(){
        return "\nFirstName : "+this.firstName +" LastName : "+this.lastName +" City : "+this.city +" State : "+this.state +" Zip : "+this.zip +" PhoneNumber : "+this.phoneNumber;
    }
}
