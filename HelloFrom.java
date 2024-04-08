import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloFrom {
    public  JPanel panel1;
    private JLabel hellolabel;
    private JButton helloButton;
    private JTextField usernameTexField;
    private JPasswordField passwordField;

    public HelloFrom() {
        helloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameTexField.getText();
                String pasword = passwordField.getText();
                System.out.println(pasword);

                if (username.equals ("rahadi") && pasword.equals("12345"))
                {
                    JOptionPane.showMessageDialog(null, "selamat datang rahadi. user an pasword benar" +
                            usernameTexField.getText());
                } else {
                    JOptionPane.showConfirmDialog(null, "USERNAME AN PASWORD BENAR");
                }
            }
        });
        }
    }
