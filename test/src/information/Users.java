package information;

public class Users {
    private String userName;
    private String passWord;

    public void setuserName(String userName){
        this.userName=userName;
    }
    public String getuserName(){
        return this.userName;
    }
    public void setpassword(String passWord){
        this.passWord=passWord;
    }
    public String getpassWord(){
        return this.passWord;
    }

    public String show(){
        String s="userName:"+this.userName+"password:"+this.passWord;
        return s;
    }
}

