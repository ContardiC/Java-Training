public class User {
    private int id;
    private int birthYear;


    public User(){

    }
    public User(int id,int birthYear){
        this.id=id;
        this.birthYear=birthYear;
    }
    public int getId(){
        return id;
    }
    public int getBirthYear(){
        return birthYear;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setBirthYear(int birthYear){
        this.birthYear=birthYear;
    }
    public String toString(){
        String res;
        res="ID: "+id;
        res+=" Anno di Nascita :"+birthYear;
        return res;
    }
}
