package library;

public abstract class User {
    protected String name;
    protected  String email;
    protected String phonenumber;
    protected  IOOperation[] operation;


    public User(String name){
        this.name = name;
    }

    public User(String name, String email, String phonenumber){
        this.name= name;
        this.email=email;
        this.phonenumber= phonenumber;
    }
    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }


    public String getPhoneNumber(){
        return phonenumber;
    }

    abstract  public void  menu();
}
