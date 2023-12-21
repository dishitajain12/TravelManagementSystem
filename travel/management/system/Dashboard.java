
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    
    JPanel p1 , p2;
    JButton addPersonalDetails , updatePersonalDetails , viewPersonalDetails , DeletePersonalDetails , checkPackages , bookPackage ;
    JButton viewpackage , viewhotels , bookhotel , viewBookedHotel , destination , payment , calculator ;
    JButton notepad , about;
    
    String username;
    Dashboard(String username){
        this.username = username;
//        setBounds(0,0,1600,1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
           
         p1 = new JPanel();
         p1.setLayout(null);
         p1.setBackground(new Color(129,19,102));
         p1.setBounds(0,0,1600,65);
         add(p1);
         
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
         Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel icon = new JLabel(i3);
         icon.setBounds(5,0,70,70);
         p1.add(icon);
         
         JLabel heading = new JLabel("Dashboard");
         heading.setBounds(80,10,300,40);
         heading.setForeground(Color.WHITE);
         heading.setFont(new Font("SERIF" , Font.BOLD , 30));
         p1.add(heading);
         
         p2 = new JPanel();
         p2.setLayout(null);
         p2.setBackground(new Color(129,19,102));
         p2.setBounds(0,65,300,900);
         add(p2);
    
         addPersonalDetails = new JButton("Add Personal Details");
         addPersonalDetails.setBounds(0,0,300,40);
         addPersonalDetails.setFont(new Font("SERIF" , Font.PLAIN , 20));
         addPersonalDetails.setBackground(new Color(255, 222, 173));
         addPersonalDetails.setMargin(new Insets(0,0,0,62));
         addPersonalDetails.addActionListener(this);
         p2.add(addPersonalDetails);
         
         updatePersonalDetails = new JButton("Update Personal Details");
         updatePersonalDetails.setBounds(0,40,300,40);
         updatePersonalDetails.setFont(new Font("SERIF" , Font.PLAIN , 20));
         updatePersonalDetails.setBackground(new Color(255, 222, 173));
         updatePersonalDetails.setMargin(new Insets(0,0,0,40));
         p2.add(updatePersonalDetails);
         
         viewPersonalDetails = new JButton("View Details");
         viewPersonalDetails.setBounds(0,80,300,40);
         viewPersonalDetails.setFont(new Font("SERIF" , Font.PLAIN , 20));
         viewPersonalDetails.setBackground(new Color(255, 222, 173));
         viewPersonalDetails.setMargin(new Insets(0,0,0,130));
         viewPersonalDetails.addActionListener(this);
         p2.add(viewPersonalDetails);
         
         DeletePersonalDetails = new JButton("Delete Details");
         DeletePersonalDetails.setBounds(0,120,300,40);
         DeletePersonalDetails.setFont(new Font("SERIF" , Font.PLAIN , 20));
         DeletePersonalDetails.setBackground(new Color(255, 222, 173));
         DeletePersonalDetails.setMargin(new Insets(0,0,0,120));
         p2.add(DeletePersonalDetails);
         
         checkPackages = new JButton("Check Package");
         checkPackages.setBounds(0,160,300,40);
         checkPackages.setFont(new Font("SERIF" , Font.PLAIN , 20));
         checkPackages.setBackground(new Color(255, 222, 173));
         checkPackages.setMargin(new Insets(0,0,0,110));
         p2.add(checkPackages);
         
         bookPackage = new JButton("Book Package");
         bookPackage.setBounds(0,200,300,40);
         bookPackage.setFont(new Font("SERIF" , Font.PLAIN , 20));
         bookPackage.setBackground(new Color(255, 222, 173));
         bookPackage.setMargin(new Insets(0,0,0,120));
         p2.add(bookPackage);
         
         viewpackage = new JButton("View Package");
         viewpackage.setBounds(0,240,300,40);
         viewpackage.setFont(new Font("SERIF" , Font.PLAIN , 20));
         viewpackage.setBackground(new Color(255, 222, 173));
         viewpackage.setMargin(new Insets(0,0,0,120));
         p2.add(viewpackage);
         
         viewhotels = new JButton("View Hotels");
         viewhotels.setBounds(0,280,300,40);
         viewhotels.setFont(new Font("SERIF" , Font.PLAIN , 20));
         viewhotels.setBackground(new Color(255, 222, 173));
         viewhotels.setMargin(new Insets(0,0,0,132));
         p2.add(viewhotels);
         
         bookhotel = new JButton("Book Hotel");
         bookhotel.setBounds(0,320,300,40);
         bookhotel.setFont(new Font("SERIF" , Font.PLAIN , 20));
         bookhotel.setBackground(new Color(255, 222, 173));
         bookhotel.setMargin(new Insets(0,0,0,134));
         p2.add(bookhotel);
         
         viewBookedHotel = new JButton("View Booked Hotel");
         viewBookedHotel.setBounds(0,360,300,40);
         viewBookedHotel.setFont(new Font("SERIF" , Font.PLAIN , 20));
         viewBookedHotel.setBackground(new Color(255, 222, 173));
         viewBookedHotel.setMargin(new Insets(0,0,0,80));
         p2.add(viewBookedHotel);
         
         destination = new JButton("Destinations");
         destination.setBounds(0,400,300,40);
         destination.setFont(new Font("SERIF" , Font.PLAIN , 20));
         destination.setBackground(new Color(255, 222, 173));
         destination.setMargin(new Insets(0,0,0,140));
         p2.add(destination);
         
         payment = new JButton("Payment");
         payment.setBounds(0,440,300,40);
         payment.setFont(new Font("SERIF" , Font.PLAIN , 20));
         payment.setBackground(new Color(255, 222, 173));
         payment.setMargin(new Insets(0,0,0,175));
         p2.add(payment);
         
         calculator = new JButton("Calculator");
         calculator.setBounds(0,480,300,40);
         calculator.setFont(new Font("SERIF" , Font.PLAIN , 20));
         calculator.setBackground(new Color(255, 222, 173));
         calculator.setMargin(new Insets(0,0,0,165));
         p2.add(calculator);
         
         notepad = new JButton("Notepad");
         notepad.setBounds(0,520,300,40);
         notepad.setFont(new Font("SERIF" , Font.PLAIN , 20));
         notepad.setBackground(new Color(255, 222, 173));
         notepad.setMargin(new Insets(0,0,0,175));
         p2.add(notepad);
         
         about = new JButton("About");
         about.setBounds(0,560,300,40);
         about.setFont(new Font("SERIF" , Font.PLAIN , 20));
         about.setBackground(new Color(255, 222, 173));
         about.setMargin(new Insets(0,0,0,190));
         p2.add(about);
         
         ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
         Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
         ImageIcon i6 = new ImageIcon(i5);
         JLabel image = new JLabel(i6);
         image.setBounds(0,0,1650,1000);
         add(image);
         
         JLabel text = new JLabel("Travel and Tourism Management System");
         text.setBounds(400,70,1200,70);
         text.setForeground(Color.WHITE);
         text.setFont(new Font("Railway", Font.BOLD , 55));
         image.add(text);
         
       setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== addPersonalDetails){
            new AddCustomer(username);
        }else if(ae.getSource() == viewPersonalDetails){
            new ViewCustomer(username);
        }
    }
    public static void main(String[] args){
        new Dashboard("");
    }
}
