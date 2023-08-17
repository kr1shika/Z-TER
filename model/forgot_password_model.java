/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import view.forgot_password;
import controller.forgot_password_controller;
/**
 *
 * @author acer
 */
public class forgot_password_model {
    private String emial;
    private String sec_1;
    private String sec_2;
    private String password;
    private String confirm_password;



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm_password() {
        return confirm_password;
    }

    public void setConfirm_password(String confirm_password) {
        this.confirm_password = confirm_password;
    }
    

    public String getEmial() {
        return emial;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }

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

    
    public void authentication_user(String emial,String sec_1,String sec_2,String password, String confirm_password){
        forgot_password_controller fpc1= new forgot_password_controller();
        fpc1.authenticate_user(emial,sec_1,sec_2,password,confirm_password);
      
        }
    public void authentication_email(String emial){
        forgot_password_controller fpc1= new forgot_password_controller();
        fpc1.authenticate_email(emial);
    
    }

}