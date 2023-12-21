package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Loading extends JFrame implements Runnable{
    
    JProgressBar bar;
    Thread t;
    int s;
    String username;

    
    public void run(){
        try {
                for (int i = 0; i < 200; i++) {
                    s = s + 1;
                    int max = bar.getMaximum();
                    int val = bar.getValue();
                    if (val < max) {
                        bar.setValue(bar.getValue() + 1);
                    } else {
                        i = 201;
                        setVisible(false);
                        new Dashboard(username);
//                        new Home(username).setVisible(true);
                    }
                    Thread.sleep(50);
                }
            } catch (Exception e) {
		e.printStackTrace();
            }
    }
    
    Loading(String username){
        this.username = username;
        t= new Thread(this);
        setBounds(500,200,650,400);
        getContentPane().setBackground(new Color(250,240,245));
        setLayout(null);
        
        
        JLabel text = new JLabel("Travel and Tourism Application");
        text.setBounds(50,20,600,40);
        text.setForeground(new Color(25, 25, 112));
        text.setFont(new Font("RAILWAY", Font.ITALIC, 35));
        add(text);
        
        bar = new JProgressBar();
        bar.setBounds(150,100,300,35);
        bar.setStringPainted(true);
        add(bar);
        
        JLabel loading = new JLabel("Loading , Please wait...");
        loading.setBounds(230,130,150,30);
        loading.setForeground(new Color(144,12,63));
        loading.setFont(new Font("RAILWAY", Font.BOLD, 16));
        add(loading);
        
        JLabel lblusername = new JLabel("Welcome " + username);
        lblusername.setBounds(20,310,400,40);
        lblusername.setForeground(new Color(144,12,63));
        lblusername.setFont(new Font("RAILWAY", Font.BOLD, 16));
        add(lblusername);
        
        t.start();
        
        setVisible(true);
    }
    
    
    public static void main(String[] args){
        new Loading("");
    }
            
}

