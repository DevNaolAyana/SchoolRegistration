package schoolregistration;

public class SchoolRegistration {
    public static void main(String[] args) {
        // Open Registration Form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm().setVisible(true);
            }
        });
        
        // Open Login Form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }
}