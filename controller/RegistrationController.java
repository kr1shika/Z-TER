package controller;

import dao.RegistrationDAO;

import javax.swing.JOptionPane;

public class RegistrationController {
    private final RegistrationDAO registrationDAO;

    public RegistrationController() {
        this.registrationDAO = new RegistrationDAO();
    }

    public void registerUser(String username, String password, String email, String confirm_password, String sec_1, String sec_2) {
        if (username.isEmpty() || password.isEmpty() || email.isEmpty() || confirm_password.isEmpty() || sec_1.isEmpty() || sec_2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No field can be empty");
        } else if (!isValidEmail(email)) {
            JOptionPane.showMessageDialog(null, "Enter a valid email (e.g., example@gmail.com)");
        } else if (password.length() < 8) {
            JOptionPane.showMessageDialog(null, "Password should be at least 8 characters long");
        } else if (sec_1.equalsIgnoreCase("ANS") || sec_2.equalsIgnoreCase("ANS")) {
            JOptionPane.showMessageDialog(null, "Security questions cannot be 'ANS'");
        } else if (password.equals(confirm_password)) {
            boolean registrationSuccess = registrationDAO.registerUser(username, password, email, sec_1, sec_2);
            if (registrationSuccess) {
                JOptionPane.showMessageDialog(null, "User registered successfully");
            } else {
                JOptionPane.showMessageDialog(null, "User already registered or username already taken");
            }
        } else {
            JOptionPane.showMessageDialog(null, "The password does not match the confirm password");
        }
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@gmail.com$";
        return email.matches(emailRegex);
    }
}
