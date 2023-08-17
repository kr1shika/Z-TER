package controller;
import view.Dashboard_1;
import dao.UserDAO;
import model.UserModel;
import view.login;
import javax.swing.JOptionPane;

public class UserController {
    private final UserDAO userDAO;

    public UserController() {
        this.userDAO = new UserDAO();
    }

    public void loginUser(String username, String password, login loginForm) {
        if ("USERNAME".equals(username)) {
            JOptionPane.showMessageDialog(null, "ENTER THE USERNAME");
        } else {
            try {
                UserModel user = userDAO.getUserByUsername(username);

                if (user != null) {
                    String storedPassword = user.getPassword();
                    

                    if (password.equals(storedPassword)) {
                        JOptionPane.showMessageDialog(null, "Login successful");
                        loginForm.dispose();
                        Dashboard_1 dashboardView = new Dashboard_1();
                        dashboardView.setVisible(true);

                    } else {
                        // Incorrect password
                        JOptionPane.showMessageDialog(null, "Incorrect password");
                    }
                } else {
                    // User does not exist
                    JOptionPane.showMessageDialog(null, "User does not exist");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
