public class User {
    private int ID;
    private int birthYear;
    private String lastName;

    public User(int ID, int birthYear,String lastName){
        this.ID=ID;
        this.birthYear=birthYear;
        this.lastName=lastName;
    }
    public int getID(){
        return ID;
    }
    public int getBirthYear(){
        return birthYear;
    }
    public String getLastName(){
        return lastName;
    }
}
