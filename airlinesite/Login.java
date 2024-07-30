
package airlinesite;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class Login extends JFrame implements ActionListener{ 
//JFrame is a class of JavaSwing which heps creating an abstract Window
    JButton submit, reset, close;
    JTextField JFusername;
    JPasswordField jfpassword;
    public Login(){
        
        getContentPane().setBackground(Color.WHITE);//Sets the background color of the window
        setLayout(null);
        //Username
        JLabel username = new JLabel("UserName");//Used to display text on the window
        username.setBounds(20, 20, 100, 20);
        add(username);
        JFusername = new JTextField();
        JFusername.setBounds(130, 20, 200, 20);
        add(JFusername);
        //Password
        JLabel password = new JLabel("Password");//Used to display text on the window
        password.setBounds(20, 60, 100, 20);
        add(password);
        jfpassword = new JPasswordField();
        jfpassword.setBounds(130, 60, 200, 20);
        add(jfpassword);
        //Buttons
        //Reset
        reset = new JButton("Reset");
        reset.setBounds(40, 120, 120, 20);
        reset.addActionListener(this);
        add(reset);
        //Submit
        submit = new JButton("Submit");
        submit.setBounds(190, 120, 120, 20);
        submit.addActionListener(this);
        add(submit);
        //Close
        close = new JButton("Close");
        close.setBounds(120, 160, 120, 20);
        close.addActionListener(this);
        add(close);
        
//====================================================================================================
        
        setSize(500, 600);//Sets the size of the frame
        setVisible(true);//Makes the frame visible
        setLocation(500,75);//Allows the changing of the location of the frame
    }
    
    
    @Override
        public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == submit){
            String username = JFusername.getText();
            String password = jfpassword.getText();
            
            try{
                Conn c = new Conn();
                String query = "select * from login where username='"+username+"'and password='"+password+"'";
                ResultSet rs = c.s.executeQuery(query);
                
                if(rs.next()){
                    new Home();
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                    setVisible(false);
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        } else if (ae.getSource() == close) {
            setVisible(false);
        } else if (ae.getSource() == reset) {
            JFusername.setText("");
            jfpassword.setText("");
        }   
        }
    
    public static void main(String[] args){
        new Login();
    }
}
