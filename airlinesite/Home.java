
package airlinesite;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Home extends JFrame implements ActionListener{
    
    public Home() {
        setLayout(null);
        URL imageURL = null;
        try {
            imageURL = new URL("https://pbs.twimg.com/media/EjjRhx6U0AAnSor.jpg");
        } catch (MalformedURLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        ImageIcon i1 = new ImageIcon(imageURL);
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1366, 740);
        add(image);
        
        JLabel heading = new JLabel("Welcome to IndiGo Airlines 6E....");
        heading.setBounds(500, 40, 1000, 40);
        heading.setForeground(Color.BLUE);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 36));
        image.add(heading);
        
        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);
        
        JMenu details = new JMenu("Details");
        menubar.add(details);
        
        JMenuItem flightDetails = new JMenuItem("Flight Details");
        flightDetails.addActionListener(this);
        details.add(flightDetails);
        
        JMenuItem customerDetails = new JMenuItem("Add Customer Details");
        customerDetails.addActionListener(this);
        details.add(customerDetails);
        
        JMenuItem bookFlight = new JMenuItem("Book Flight");
        bookFlight.addActionListener(this);
        details.add(bookFlight);
        
        JMenuItem journeyDetails = new JMenuItem("Journey Details");
        journeyDetails.addActionListener(this);
        details.add(journeyDetails);
        
        JMenuItem ticketCancellation = new JMenuItem("Cancel Ticket");
        ticketCancellation.addActionListener(this);
        details.add(ticketCancellation);
        
        JMenuItem ticket = new JMenuItem ("Ticket");
        menubar.add(ticket);
        
        JMenuItem boardingPass = new JMenuItem("Boarding Pass");
        boardingPass.addActionListener(this);
        ticket.add(boardingPass);
        
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        String text = ae.getActionCommand();
        
        if (text.equals("Add Customer Details")) {
            new AddCustomer();
        } else if (text.equals("Flight Details")) {
            new FlightInfo();
        } else if (text.equals("Book Flight")) {
            new BookFlight();
        } else if (text.equals("Journey Details")) {
            new JourneyDetails();
        } else if (text.equals("Cancel Ticket")) {
            new Cancel();
        } else if(text.equals("Boarding Pass")){
            new BoardingPass();
        }
    }
    
    public static void main(String[] args) {
        new Home();
    }
}

//PNR-988253
//458787849889
//TIC-8935
