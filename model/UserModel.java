package model;
import controller.UserController;
import view.login;
public class UserModel{

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    private String username,password;
    
        public void registerUser() {
        UserController usercontroller = new UserController();
        login l1= new login();
        usercontroller.loginUser(username, password,l1);
    }
}