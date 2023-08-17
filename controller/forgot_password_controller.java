package controller;

import dao.ForgotPasswordDAO;

import javax.swing.JOptionPane;

public class forgot_password_controller {
    private final ForgotPasswordDAO forgotPasswordDAO;

    public forgot_password_controller() {
        this.forgotPasswordDAO = new ForgotPasswordDAO();
    }

    public void authenticate_user(String email, String sec_1, String sec_2, String password, String confirm_password) {
        if (!password.equals(confirm_password)) {
            JOptionPane.showMessageDialog(null, "Passwords do not match");
            return;
        }

        boolean authenticationSuccess = forgotPasswordDAO.authenticateUser(email, sec_1, sec_2, password);
        if (authenticationSuccess) {
            JOptionPane.showMessageDialog(null, "Password successfully changed");
        } else {
            JOptionPane.showMessageDialog(null, "Email not found or security questions not answered correctly");
        }
    }

    public void authenticate_email(String email) {
        boolean emailExists = forgotPasswordDAO.checkEmailExists(email);
        if (emailExists) {
            JOptionPane.showMessageDialog(null, "Email is registered");
        } else {
            JOptionPane.showMessageDialog(null, "Email not found");
        }
    }
}
