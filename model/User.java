package model;

import controller.RegistrationController;

public class User {
    private String username;
    private String password;

    public String getSec_1() {
        return sec_1;
    }

    public void setSec_1(String sec_1) {
        this.sec_1 = sec_1;
    }

    public String getSec_2() {
        return sec_2;
    }

    public void setSec_2(String sec_2) {
        this.sec_2 = sec_2;
    }
    private String email;
    private String confirm_password;
    private String sec_1;
    private String sec_2;

    public User(String username, String password, String email, String confirm_password,String sec_1, String sec_2) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.confirm_password = confirm_password;
        this.sec_1=sec_1;
        this.sec_2=sec_2;
    }

    // Getters and Setters for the user fields

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConfirm_password() {
        return confirm_password;
    }

    public void setConfirm_password(String confirm_password) {
        this.confirm_password = confirm_password;
    }
    

    public void registerUser() {
        RegistrationController registrationController = new RegistrationController();
        registrationController.registerUser(username, password, email, confirm_password,sec_1,sec_2);
    }
}
