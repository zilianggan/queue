package newpackage;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Counter implements ActionListener{
    public void actionPerformed(ActionEvent ex){
        try{
            if(ex.getSource()==b1)  //go online/ offline
            {
                if(b1.getText()==online)
                {
                    b.setBackground(Color.red);
                    b1.setText(offline);
                    NewMain.c1.setBackground(1);
                }
                else if(b1.getText()==offline)
                {
                    b.setBackground(Color.green);
                    b1.setText(online);
                    NewMain.c1.setBackground(13);
                }
            }
            else if(ex.getSource()==b2&&b1.getText()==online)   //complete process
            {
                if(NewMain.c1.getBackground(1)==Color.red)
                {
                    NewMain.c1.setBackground(9);
                }
                else{
                    JOptionPane.showMessageDialog(x1,"No ticket is processing!");
                }
            }
            else if(ex.getSource()==b3&&b1.getText()==online)   //call next
            {
                int[] queue = NewMain.c1.getQueue();
                int front = NewMain.c1.getFront();
                if(front==-1||queue[front]==0)
                {
                    JOptionPane.showMessageDialog(x1,"No more ticket!");
                }
                else
                {
                NewMain.c1.setLabel(queue[front],1);
                NewMain.c1.setBackground(5);
                queue[front]=0;
                front++;
                NewMain.c1.setFront(front);
                }
            }
            else if(ex.getSource()==b4) //go online/ offline
            {
                if(b4.getText()==online)
                {
                    c.setBackground(Color.red);
                    b4.setText(offline);
                    NewMain.c1.setBackground(2);
                }
                else if(b4.getText()==offline)
                {
                    c.setBackground(Color.green);
                    b4.setText(online);
                    NewMain.c1.setBackground(14);
                }
            }
            else if(ex.getSource()==b5&&b4.getText()==online)   //complete process
            {
                if(NewMain.c1.getBackground(2)==Color.red){
                    NewMain.c1.setBackground(10);
                }
                else{
                    JOptionPane.showMessageDialog(x1,"No ticket is processing!");
                }
            }
            else if(ex.getSource()==b6&&b4.getText()==online)   //call next
            {
                int[] queue = NewMain.c1.getQueue();
                int front = NewMain.c1.getFront();
                if(front==-1||queue[front]==0)
                {
                    JOptionPane.showMessageDialog(x1,"No more ticket!");
                }
                else
                {
                NewMain.c1.setLabel(queue[front],2);
                NewMain.c1.setBackground(6);
                queue[front]=0;
                front++;
                NewMain.c1.setFront(front);
                }
            }
            else if(ex.getSource()==b7)  //go online/ offline
            {
                if(b7.getText()==online)
                {
                    d.setBackground(Color.red);
                    b7.setText(offline);
                    NewMain.c1.setBackground(3);
                }
                else if(b7.getText()==offline)
                {
                    d.setBackground(Color.green);
                    b7.setText(online);
                    NewMain.c1.setBackground(15);
                }
            }
            else if(ex.getSource()==b8&&b7.getText()==online)   //complete process
            {
                if(NewMain.c1.getBackground(3)==Color.red){
                    NewMain.c1.setBackground(11);
                }
                else{
                    JOptionPane.showMessageDialog(x1,"No ticket is processing!");
                }
            }
            else if(ex.getSource()==b9&&b7.getText()==online)   //call next
            {
                int[] queue = NewMain.c1.getQueue();
                int front = NewMain.c1.getFront();
                if(front==-1||queue[front]==0)
                {
                    JOptionPane.showMessageDialog(x1,"No more ticket!");
                }
                else
                {
                NewMain.c1.setLabel(queue[front],3);
                NewMain.c1.setBackground(7);
                queue[front]=0;
                front++;
                NewMain.c1.setFront(front);
                }
            }
            else if(ex.getSource()==b10) //go online/ offline
            {
                if(b10.getText()==online)
                {
                    e.setBackground(Color.red);
                    b10.setText(offline);
                    NewMain.c1.setBackground(4);
                }
                else if(b10.getText()==offline)
                {
                    e.setBackground(Color.green);
                    b10.setText(online);
                    NewMain.c1.setBackground(16);
                }
            }
            else if(ex.getSource()==b11&&b10.getText()==online)  //complete process
            {
                if(NewMain.c1.getBackground(4)==Color.red){
                    NewMain.c1.setBackground(12);
                }
                else{
                    JOptionPane.showMessageDialog(x1,"No ticket is processing!");
                }
            }
            else if(ex.getSource()==b12&&b10.getText()==online)    //call next
            {
                int[] queue = NewMain.c1.getQueue();
                int front = NewMain.c1.getFront();
                if(front==-1||queue[front]==0)
                {
                    JOptionPane.showMessageDialog(x1,"No more ticket!");
                }
                else
                {
                NewMain.c1.setLabel(queue[front],4);
                NewMain.c1.setBackground(8);
                queue[front]=0;
                front++;
                NewMain.c1.setFront(front);
                }
            }else{
                JOptionPane.showMessageDialog(x1,"Please online before start process!");  //prompt error
            }
        }catch(Exception ex1){
            JOptionPane.showMessageDialog(x1,"Invalid Input!");  //prompt error
        }
    }
    private JFrame x1;
    private String status;
    String online = "Go offline",offline = "Go online";
    public JFrame getJFrame(){
        return x1;
    }
    private JPanel b,c,d,e;
    private JLabel l1,l2,l3,l4;
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;    //create button
    // constructor
    public Counter(){
        x1= new JFrame("Counter View");     //first page of the system
        x1.setSize(800,300);     //set size
        x1.setLocation(800,450);     //set location
        x1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //x1.setLayout(new BorderLayout());
        x1.setLayout(new GridLayout(0,4));
        
        b = new JPanel();
        b.setLayout(new GridLayout(3,0));
        b.setBackground(Color.green);
        l1= new JLabel("Counter 1");
        b.add(l1);
        b1 = new JButton("Go offline");
        status=online;
        b.add(b1);
        b2 = new JButton("Comp curr");
        b.add(b2);
        b3 = new JButton("Call Next");
        b.add(b3);
        
        c = new JPanel();
        c.setLayout(new GridLayout(3,0));
        c.setBackground(Color.green);
        l2= new JLabel("Counter 2");
        c.add(l2);
        b4 = new JButton("Go offline");
        c.add(b4);
        b5 = new JButton("Comp curr");
        c.add(b5);
        b6 = new JButton("Call Next");
        c.add(b6);
        
        d = new JPanel();
        d.setLayout(new GridLayout(3,0));
        d.setBackground(Color.green);
        l3= new JLabel("Counter 3");
        d.add(l3);
        b7 = new JButton("Go offline");
        d.add(b7);
        b8 = new JButton("Comp curr");
        d.add(b8);
        b9 = new JButton("Call Next");
        d.add(b9);
        
        e = new JPanel();
        e.setLayout(new GridLayout(3,0));
        e.setBackground(Color.green);
        l4= new JLabel("Counter 4");
        e.add(l4);
        b10 = new JButton(online);
        e.add(b10);
        b11 = new JButton("Comp curr");
        e.add(b11);
        b12 = new JButton("Call Next");
        e.add(b12);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        //x1.add(b,BorderLayout.WEST);x1.add(c,BorderLayout.CENTER);x1.add(d,BorderLayout.);x1.add(e,BorderLayout.CENTER);
        x1.add(b);x1.add(c);x1.add(d);x1.add(e);
        //create actionlistener object so the system will listen to user input
        
        x1.setVisible(true); //show when the system run
    }
}
