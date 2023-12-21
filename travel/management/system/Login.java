package travel.management.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{

	JPanel p1;
	JTextField tfusername;
        JPasswordField passwordField;
	
        JButton b1,b2,b3;


	public Login() {
            
	setBackground(new Color(255, 255, 204));	
        setBounds(550, 250, 700, 400);
		
        p1 = new JPanel();
	p1.setBackground(Color.WHITE);
	setContentPane(p1);
	p1.setLayout(null);
        
        

	JLabel lblusername = new JLabel("Username : ");
	lblusername.setBounds(124, 89, 95, 24);
	p1.add(lblusername);

	JLabel l2 = new JLabel("Password : ");
	l2.setBounds(124, 124, 95, 24);
	p1.add(l2);

	tfusername = new JTextField();
	tfusername .setBounds(210, 93, 157, 20);
	p1.add(tfusername );
	
	passwordField = new JPasswordField();
	passwordField.setBounds(210, 128, 157, 20);
	p1.add(passwordField);

	JLabel l3 = new JLabel("");
	l3.setBounds(377, 79, 46, 34);
	p1.add(l3);

	JLabel l4 = new JLabel("");
	l4.setBounds(377, 124, 46, 34);
	p1.add(l3);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(480, 70, 150, 150);
        add(image);
        
        
	b1 = new JButton("Login");
	b1.addActionListener(this);
                
	b1.setForeground(new Color(46, 139, 87));
	b1.setBackground(new Color(176, 224, 230));
	b1.setBounds(149, 181, 113, 25);
	p1.add(b1);
		
        b2 = new JButton("SignUp");
	b2.addActionListener(this);
	
	b2.setForeground(new Color(139, 69, 19));
	b2.setBackground(new Color(255, 235, 205));
	b2.setBounds(289, 181, 113, 25);
	p1.add(b2);

	b3 = new JButton("Forgot Password");
	b3.addActionListener(this);
	
        b3.setForeground(new Color(205, 92, 92));
	b3.setBackground(new Color(253, 245, 230));
	b3.setBounds(199, 231, 179, 25);
	p1.add(b3);

	JLabel l5 = new JLabel("Trouble in Login?");
	l5.setFont(new Font("Tahoma", Font.PLAIN, 15));
	l5.setForeground(new Color(255, 0, 0));
	l5.setBounds(70, 235, 110, 20);
	p1.add(l5);

        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(255, 255, 204));
        panel2.setBounds(24, 40, 434, 263);
        p1.add(panel2);
        
        setVisible(true);
	}
        
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == b1){
        
        try {
           
            String username = tfusername.getText();
            char[] passwordChars = passwordField.getPassword();
            String password = new String(passwordChars);  // Get the password as a string

            // Define the SQL query with placeholders
          
            String query = "SELECT * FROM account WHERE username='"+username +"' AND password='"+password+"'";
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery(query);

            
            if (rs.next()) {
                setVisible(false);
                Loading load = new Loading(username);
                load.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Login or Password!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
            }
            if(ae.getSource() == b2){
                setVisible(false);
		Signup su = new Signup();
		su.setVisible(true);
            }   
            if(ae.getSource() == b3){
                setVisible(false);
		ForgetPassword forgot = new ForgetPassword();
		forgot.setVisible(true);
            }
        }
        
  	public static void main(String[] args) {
                new Login();
	}

}



