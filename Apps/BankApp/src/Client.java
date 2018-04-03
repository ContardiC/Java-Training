public class Client {
    private int ID;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String email;
    private String mobile;

    public Client(int ID, String firstName,String lastName,String address, String city, String email, String mobile){
        this.ID=ID;
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.city=city;
        this.email=email;
        this.mobile=mobile;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
