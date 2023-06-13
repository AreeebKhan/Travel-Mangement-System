package travel.managment.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.*;
import java.awt.event.*;


public class Dashboard extends JFrame implements ActionListener{
    
    String username;
    JButton addPersonalDetails,viewPersonalDetails;
    Dashboard(String username){
        this.username = username;
    //setBounds(0,0,1600,1000);
    setExtendedState(JFrame.MAXIMIZED_BOTH);
    setLayout(null);
    
    JPanel p1 = new JPanel();
    p1.setBackground(new Color(0,0,102));
    p1.setBounds(0,0,1600,65);
    p1.setLayout(null);
    add(p1);   
    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
    Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel icon = new JLabel(i3);
    icon.setBounds(5,0,70,70);
    p1.add(icon);
    
    JLabel heading = new JLabel("Dashboard");
    heading.setBounds(80,10,300,40);
    heading.setFont(new Font("Tahoma", Font.BOLD, 30));
    heading.setForeground(Color.WHITE);
    p1.add(heading);
    
    JPanel p2 = new JPanel();
    p2.setBackground(new Color(0,0,102));
    p2.setBounds(0,65,300,900);
    p2.setLayout(null);
    add(p2);  
    
    addPersonalDetails = new JButton ("Add Personal Details");
    addPersonalDetails.setBounds(0,0,300,50);
    addPersonalDetails.setBackground(new Color(0,0,102));
    addPersonalDetails.setForeground(Color.WHITE);
    addPersonalDetails.setFont(new Font("Tahoma" , Font.BOLD,20));
    addPersonalDetails.setMargin(new Insets(0 , 0, 0 , 60));
    addPersonalDetails.addActionListener(this);
    p2.add(addPersonalDetails);
    
    JButton updatePersonalDetails = new JButton ("Update Personal Details");
    updatePersonalDetails.setBounds(0,50,300,50);
    updatePersonalDetails.setBackground(new Color(0,0,102));
    updatePersonalDetails.setForeground(Color.WHITE);
    updatePersonalDetails.setFont(new Font("Tahoma" , Font.BOLD,20));
    updatePersonalDetails.setMargin(new Insets(0 , 0, 0 , 30));
    //login.addActionListener(this);
    p2.add(updatePersonalDetails);
    
    viewPersonalDetails = new JButton ("View Details");
    viewPersonalDetails.setBounds(0,100,300,50);
    viewPersonalDetails.setBackground(new Color(0,0,102));
    viewPersonalDetails.setForeground(Color.WHITE);
    viewPersonalDetails.setFont(new Font("Tahoma" , Font.BOLD,20));
    viewPersonalDetails.setMargin(new Insets(0 , 0, 0 , 140));
    viewPersonalDetails.addActionListener(this);
    p2.add(viewPersonalDetails);
    
    JButton deletePersonalDetails = new JButton ("Delete Personal Details");
    deletePersonalDetails.setBounds(0,150,300,50);
    deletePersonalDetails.setBackground(new Color(0,0,102));
    deletePersonalDetails.setForeground(Color.WHITE);
    deletePersonalDetails.setFont(new Font("Tahoma" , Font.BOLD,20));
    deletePersonalDetails.setMargin(new Insets(0 , 0, 0 , 30));
    //login.addActionListener(this);
    p2.add(deletePersonalDetails);
    
    JButton checkpackages = new JButton ("Check Package");
    checkpackages.setBounds(0,200,300,50);
    checkpackages.setBackground(new Color(0,0,102));
    checkpackages.setForeground(Color.WHITE);
    checkpackages.setFont(new Font("Tahoma" , Font.BOLD,20));
    checkpackages.setMargin(new Insets(0 , 0, 0 , 110));
    //login.addActionListener(this);
    p2.add(checkpackages);
    
    JButton bookpackages = new JButton ("Book Package");
    bookpackages.setBounds(0,250,300,50);
    bookpackages.setBackground(new Color(0,0,102));
    bookpackages.setForeground(Color.WHITE);
    bookpackages.setFont(new Font("Tahoma" , Font.BOLD,20));
    bookpackages.setMargin(new Insets(0 , 0, 0 , 120));
    //login.addActionListener(this);
    p2.add(bookpackages);
    
    JButton viewpackages = new JButton ("View Package");
    viewpackages.setBounds(0,300,300,50);
    viewpackages.setBackground(new Color(0,0,102));
    viewpackages.setForeground(Color.WHITE);
    viewpackages.setFont(new Font("Tahoma" , Font.BOLD,20));
    viewpackages.setMargin(new Insets(0 , 0, 0 , 120));
    //login.addActionListener(this);
    p2.add(viewpackages);
    
    JButton viewhotels = new JButton ("View Hotels");
    viewhotels.setBounds(0,350,350,50);
    viewhotels.setBackground(new Color(0,0,102));
    viewhotels.setForeground(Color.WHITE);
    viewhotels.setFont(new Font("Tahoma" , Font.BOLD,20));
    viewhotels.setMargin(new Insets(0 , 0, 0 , 180));
    //login.addActionListener(this);
    p2.add(viewhotels);
    
    JButton bookhotel = new JButton ("Book Hotel");
    bookhotel.setBounds(0,400,350,50);
    bookhotel.setBackground(new Color(0,0,102));
    bookhotel.setForeground(Color.WHITE);
    bookhotel.setFont(new Font("Tahoma" , Font.BOLD,20));
    bookhotel.setMargin(new Insets(0 , 0, 0 , 190));
    //login.addActionListener(this);
    p2.add(bookhotel);
    
    JButton viewbookedhotel = new JButton ("View Booked Hotel");
    viewbookedhotel.setBounds(0,450,350,50);
    viewbookedhotel.setBackground(new Color(0,0,102));
    viewbookedhotel.setForeground(Color.WHITE);
    viewbookedhotel.setFont(new Font("Tahoma" , Font.BOLD,20));
    viewbookedhotel.setMargin(new Insets(0 , 0, 0 , 110));
    //login.addActionListener(this);
    p2.add(viewbookedhotel);
    
    JButton destinations = new JButton ("Destinations");
    destinations.setBounds(0,500,350,50);
    destinations.setBackground(new Color(0,0,102));
    destinations.setForeground(Color.WHITE);
    destinations.setFont(new Font("Tahoma" , Font.BOLD,20));
    destinations.setMargin(new Insets(0 , 0, 0 , 170));
    //login.addActionListener(this);
    p2.add(destinations);
    
    JButton payments = new JButton ("Payments");
    payments.setBounds(0,550,350,50);
    payments.setBackground(new Color(0,0,102));
    payments.setForeground(Color.WHITE);
    payments.setFont(new Font("Tahoma" , Font.BOLD,20));
    payments.setMargin(new Insets(0 , 0, 0 , 200));
    //login.addActionListener(this);
    p2.add(payments);
    
    JButton about = new JButton ("About");
    about.setBounds(0,600,350,50);
    about.setBackground(new Color(0,0,102));
    about.setForeground(Color.WHITE);
    about.setFont(new Font("Tahoma" , Font.BOLD,20));
    about.setMargin(new Insets(0 , 0, 0 , 240));
    //login.addActionListener(this);
    p2.add(about);
    
    ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
    Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
    ImageIcon i6 = new ImageIcon(i5);
    JLabel image = new JLabel(i6);
    image.setBounds(0,0,1650,1000);
    add(image);
    
    JLabel text = new JLabel("TRAVEL AND TOURISM MANAGEMENT SYSTEM");
    text.setBounds(400,70,1200,70);
    text.setForeground(Color.WHITE);
    text.setFont(new Font("Raleway",Font.BOLD,40));
    image.add(text);
    
    
    setVisible(true);
    
}
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == addPersonalDetails){
            new AddCustomer(username);
        }else if(ae.getSource() == viewPersonalDetails){
            new ViewCustomer(username);
    }
    }

public static void main(String [] args){
    new Dashboard("");
}
}


