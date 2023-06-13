package travel.managment.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;

public class AddCustomer extends JFrame implements ActionListener {
    
    JLabel labelusername,labelname;
    Choice comboid;
    JTextField tfnumber,tfcountry,tfaddress,tfemail,tfphone;
    JRadioButton rmale,rfemale;
    JButton add,back;
    
    AddCustomer(String username){
        setBounds(450,200,850,550);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30,50, 150, 25);
        add(lblusername);
        
        labelusername = new JLabel();
        labelusername.setBounds(220,50, 150, 25);
        add(labelusername);
        
        JLabel lblid = new JLabel("ID");
        lblid.setBounds(30,90, 150, 25);
        add(lblid);
        
        comboid = new Choice();
        //comboid.add("Select any one");
        comboid.add("Passport");
        comboid.add("Aadhar Card");
        comboid.add("Pan Card");
        comboid.setBounds(220,90,150,25);
        add(comboid);
        
        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(30,130, 150, 25);
        add(lblnumber);
        
        tfnumber = new JTextField();
        tfnumber.setBounds(220,130,150,25);
        add(tfnumber);
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(30,170, 150, 25);
        add(lblname);
        
        labelname = new JLabel();
        labelname.setBounds(220,170, 150, 25);
        add(labelname);
        
        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(30,210, 150, 25);
        add(lblgender);
        
        rmale = new JRadioButton("Male");
        rmale.setBounds(220,210,70,25);
        rmale.setBackground(Color.WHITE);
        add(rmale);
        
        rfemale = new JRadioButton("Female");
        rfemale.setBounds(300,210,70,25);
        rfemale.setBackground(Color.WHITE);
        add(rfemale);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rmale);
        bg.add(rfemale);
        
        JLabel lblcountry = new JLabel("Country");
        lblcountry.setBounds(30,250, 150, 25);
        add(lblcountry);
        
        tfcountry = new JTextField();
        tfcountry.setBounds(220,250, 150, 25);
        add(tfcountry);
        
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(30,290, 150, 25);
        add(lbladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(220,290, 150, 25);
        add(tfaddress);
        
        JLabel lblemail = new JLabel("Email Address");
        lblemail.setBounds(30,330, 150, 25);
        add(lblemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(220,330, 150, 25);
        add(tfemail);
        
        JLabel lblphone = new JLabel("Contact No");
        lblphone.setBounds(30,370, 150, 25);
        add(lblphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(220,370, 150, 25);
        add(tfphone);
        
        add = new JButton("Add");
        add.setBounds(70,430,100,25);
        add.setBackground(Color.black);
        add.setForeground(Color.WHITE);
        //add.setBorder(new LineBorder(new Color(133,193,233)));
        add.addActionListener(this);
        add(add);
        
        back = new JButton("Back");
        back.setBounds(220,430,100,25);
        back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
        //add.setBorder(new LineBorder(new Color(133,193,233)));
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400, 40, 450, 420);
        add(image);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from account where username = 'Manyam'");
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelname.setText(rs.getNString("name"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        
        
        
        setVisible(true);
    }
    
    public void actionPerformed (ActionEvent ae){
        if (ae.getSource() == add){
            String username = labelusername.getText();
            String id = (String) comboid.getSelectedItem();
            String number = tfnumber.getText();
            String name = labelname.getText();
            String gender = null;
            if(rmale.isSelected()){
                gender = "Male";
            } else {
                gender = "Female";
            }
            String country = tfcountry.getText();
            String address = tfaddress.getText();
            String email = tfemail.getText();
            String phone = tfphone.getText();
            
            try{
                Conn c = new Conn();
                String query = "insert into customer values('"+username+"' ,'"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+address+"','"+phone+"','"+email+"')";
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null,"Customer Details Added Successfully");
                setVisible(false);
            } catch (Exception e){
                e.printStackTrace();
            }
        }else{
            setVisible(false);
        }
    }
    
    public static void main(String [] args){
        new AddCustomer("");
    }
    
}
