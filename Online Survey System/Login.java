import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Login {
private JFrame frame;
private JTextField usernameField;
private JPasswordField passwordField;
private JButton loginButton;
private JButton signUpButton;

public void loginView() {
frame = new JFrame("Login");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(300, 200);

JPanel panel = new JPanel();
panel.setLayout(null);

JLabel usernameLabel = new JLabel("Username:");
usernameLabel.setBounds(10, 20, 80, 25);
panel.add(usernameLabel);

usernameField = new JTextField(20);
usernameField.setBounds(100, 20, 165, 25);
panel.add(usernameField);

JLabel passwordLabel = new JLabel("Password:");
passwordLabel.setBounds(10, 50, 80, 25);
panel.add(passwordLabel);

passwordField = new JPasswordField(20);
passwordField.setBounds(100, 50, 165, 25);
panel.add(passwordField);

loginButton = new JButton("LOGIN");
loginButton.setBounds(100, 80, 80, 25);
loginButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String username = usernameField.getText();
String password = new String(passwordField.getPassword());
boolean loginStatus = login(username, password);
if (loginStatus) {
JOptionPane.showMessageDialog(frame, "Login Successful!");
new MainPage(username);
frame.dispose();
} else {
JOptionPane.showMessageDialog(frame, "Invalid username or password.");
}
}
});
panel.add(loginButton);

signUpButton = new JButton("SIGN UP");
signUpButton.setBounds(100, 110, 80, 25);
signUpButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
new SignUp().signUpView();
}
});
panel.add(signUpButton);

frame.getContentPane().add(panel);
frame.setVisible(true);
}

private boolean login(String username, String password) {
boolean status = false;
try {
Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/survey_system", "root", "");
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery("SELECT * FROM users WHERE username='" + username + "' AND password='" + password + "'");
if (resultSet.next()) {
status = true;
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
return status;
}
}