package hotel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Dashboard extends JFrame implements ActionListener{
    
    JMenuBar mb;
    JMenu m1, m2;
    JMenuItem i1, i2, i3, i4;
    
    Dashboard(){
        mb = new JMenuBar();
        add(mb);
        
        m1 = new JMenu("HOTEL MANAGEMENT");
        mb.add(m1);
        m1.setForeground(Color.RED);
        
        m2 = new JMenu("ADMIN");
        mb.add(m2);
        m2.setForeground(Color.BLUE);
        
        i1 = new JMenuItem("RECEPTION");
        i1.addActionListener(this);
        m1.add(i1);
        
        
        
        i2 = new JMenuItem("ADD EMPLOYEE");
        i2.addActionListener(this);
        m2.add(i2);
        
        i3 = new JMenuItem("ADD ROOMS");
        i3.addActionListener(this);
        m2.add(i3);
        
        i4 = new JMenuItem("ADD DRIVERS");
        i4.addActionListener(this);
        m2.add(i4);
        
        mb.setBounds(0,0,1920,30);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Hotel/Management/System/icons/new.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1800,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(-200,0,1700,700);
        add(l1);
        
        JLabel l2 = new JLabel("THE TAJ GROUP WELCOME YOU");
        l2.setBounds(480,0,2000,100);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 50));
        l1.add(l2);
        
        setLayout(null);
        setBounds(-8,0, 1920, 1080);
        setVisible(true);
        
        
    }  
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("RECEPTION")){
           new Reception().setVisible(true);
    }else if(ae.getActionCommand().equals("ADD EMPLOYEE")){
       new AddEmployee().setVisible(true); 
    }else if(ae.getActionCommand().equals("ADD ROOMS")){
        new AddRooms().setVisible(true);
    }else if (ae.getActionCommand().equals("ADD DRIVERS")){
        new AddDriver().setVisible(true);
    }
    }
    public static void main(String[]args){
        new Dashboard().setVisible(true);
    }
}
