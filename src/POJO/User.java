package POJO;

public class User {
    private String userName;
    private String userPsd;
    public String userEmail;
    public User()
    {

    }
    public User(String userName,String userPsd){
        this.userName=userName;
        this.userPsd=userPsd;

    }
    public User(String userName,String userPsd,String userEmail){
        this.userName=userName;
        this.userPsd=userPsd;
        this.userEmail=userEmail;
    }
    public String getUserName(){
        return userName;
    }
    public String getUserPsd(){
        return  userPsd;
    }
    public void setUsername(String userName) {
            this.userName = userName;
    }

    public void setUserPsd(String userPsd) {
        this.userPsd = userPsd;
    }
    public void setUserEmail(String userEmail){
        this.userEmail=userEmail;
    }

    public String getUserEmail() {
        return userEmail;
    }
}

