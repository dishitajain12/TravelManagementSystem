
package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class ViewCustomer extends JFrame implements ActionListener{
    
    JLabel labelusername , labelid , labelnumber , labelname , labelgender ;
    JLabel labelcountry , labeladdress , labelphone , labelemail;
    JButton back;
    
    String username;
    ViewCustomer(String username){
      this.username = username;
      setBounds(450,180,870,625);
      getContentPane().setBackground(new Color(120,100,120));
      setForeground(Color.WHITE);
      setLayout(null);
      
      JLabel lblusername = new JLabel("Username");
      lblusername.setBounds(30,50,150,25);
      add(lblusername);
      
      labelusername = new JLabel();
      labelusername.setBounds(220,50,150,25);
      labelusername.setForeground(Color.WHITE);
      add(labelusername);
      
      JLabel lblid = new JLabel("Id");
      lblid.setBounds(30,110,150,25);
      add(lblid);
      
      labelid = new JLabel();
      labelid.setBounds(220,110,150,25);
      labelid.setForeground(Color.WHITE);
      add(labelid);
      
      JLabel lblnumber = new JLabel("Number");
      lblnumber.setBounds(30,170,150,25);
      add(lblnumber);
       
      labelnumber = new JLabel();
      labelnumber.setBounds(220,170,150,25);
      labelnumber.setForeground(Color.WHITE);
      add(labelnumber);
      
      JLabel lblname= new JLabel("Name");
      lblname.setBounds(30,230,150,25);
      add(lblname);
       
      labelname = new JLabel();
      labelname.setBounds(220,230,150,25);
      labelname.setForeground(Color.WHITE);
      add(labelname);
      
      JLabel lblgender = new JLabel("Gender");
      lblgender.setBounds(30,290,150,25);
      add(lblgender);
       
      labelgender = new JLabel();
      labelgender.setBounds(220,290,150,25);
      labelgender.setForeground(Color.WHITE);
      add(labelgender);
      
      JLabel lblcountry = new JLabel("Country");
      lblcountry.setBounds(500,50,150,25);
      add(lblcountry);
      
      labelcountry = new JLabel();
      labelcountry.setBounds(690,50,150,25);
      labelcountry.setForeground(Color.WHITE);
      add(labelcountry);
      
      JLabel lbladdress = new JLabel("Address");
      lbladdress.setBounds(500,110,150,25);
      add(lbladdress);
      
      labeladdress = new JLabel();
      labeladdress.setBounds(690,110,150,25);
      labeladdress.setForeground(Color.WHITE);
      add(labeladdress);
      
      JLabel lblphone = new JLabel("Phone");
      lblphone.setBounds(500,170,150,25);
      add(lblphone);
       
      labelphone = new JLabel();
      labelphone.setBounds(690,170,150,25);
      labelphone.setForeground(Color.WHITE);
      add(labelphone);
      
      JLabel lblemail= new JLabel("Email");
      lblemail.setBounds(500,230,150,25);
      add(lblemail);
       
      labelemail = new JLabel();
      labelemail.setBounds(690,230,150,25);
      labelemail.setForeground(Color.WHITE);
      add(labelemail);
      
      back = new JButton("Back");
      back.setBackground(Color.BLACK);
      back.setForeground(Color.WHITE);
      back.setBounds(350,350,100,25);
      back.addActionListener(this);
      add(back);
      
      try{
          Conn c  = new Conn();
           String query = "select * from customer where username = '"+username+"'";
           ResultSet rs = c.s.executeQuery(query);
           while(rs.next()){
               labelusername.setText(rs.getString("username"));
               labelid.setText(rs.getString("id"));               
               labelnumber.setText(rs.getString("number"));
               labelname.setText(rs.getString("name"));
               labelcountry.setText(rs.getString("country"));
               labeladdress.setText(rs.getString("address"));
               labelphone.setText(rs.getString("phone"));
               labelemail.setText(rs.getString("email"));
               labelgender.setText(rs.getString("gender"));

           }
           
           
      }catch(Exception e){
          
      }
      
      setVisible(true);
    }
    
     public void actionPerformed(ActionEvent ae){
         setVisible(false);
     }
     
     public static void main(String[] args){
         new ViewCustomer("Dishita");
     }
}
