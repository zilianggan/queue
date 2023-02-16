package newpackage;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Customer implements ActionListener{
    public void actionPerformed(ActionEvent e){
        try{
            if(e.getSource()==a)
            {
                int id = 8000+(end+1);
                if(front == -1)
                {
                    front = 0;
                }
                c.setText("Last Number: "+String.format("%d",id));
                end++;
                queue[end]=id;
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(x,"Invalid Input!");  //prompt error
        }
    }
    
    int queue[] = new int[1000];
    int size = queue.length;
    int front = -1,end = -1;
    
    public int[] getQueue() //pass the queue to the counter class
    {
        return queue;
    }
    
    public int getFront()   //pass the front to the counter class
    {
        return front;
    }
    
    public void setFront(int newfront)  //set the front while the front is adjusted in counter class
    {
        front = newfront;
    }
    public void setLabel(int id,int counter)
    {
        //set the current ticket label in counter 1
        if(counter==1)
        {
            n1.setText(id+"");
        }else if(counter==2)//set the current ticket label in counter 2
        {
            n2.setText(id+"");
        }else if(counter==3)//set the current ticket label in counter 3
        {
            n3.setText(id+"");
        }else if(counter==4)//set the current ticket label in counter 4
        {
            n4.setText(id+"");
        }
        b.setText("Last Number: "+id);//change the last number of the ticket
    }
    public void setBackground(int i)
    {
        //change the counter panel while it is offline
        if(i==1)
        {
            p2.setBackground(Color.GRAY);
        }
        else if(i==2)
        {
            p3.setBackground(Color.gray);
        }
        else if(i==3)
        {
            p4.setBackground(Color.gray);
        }
        else if(i==4)
        {
            p5.setBackground(Color.gray);
        }
        //change the counter panel while it is processing the ticket or call next
        else if(i==5)
        {
            p2.setBackground(Color.red);
        }else if(i==6)
        {
            p3.setBackground(Color.red);
        }else if(i==7)
        {
            p4.setBackground(Color.red);
        }else if(i==8)
        {
            p5.setBackground(Color.red);
        }
        //change the counter panel while it is done processing the ticket or complete process
        else if(i==9)
        {
            p2.setBackground(Color.green);
        }else if(i==10)
        {
            p3.setBackground(Color.green);
        }else if(i==11)
        {
            p4.setBackground(Color.green);
        }else if(i==12)
        {
            p5.setBackground(Color.green);
        }
        //change the counter panel while the counter is online again
        else if(i==13)
        {
            p2.setBackground(Color.white);
        }else if(i==14)
        {
            p3.setBackground(Color.white);
        }else if(i==15)
        {
            p4.setBackground(Color.white);
        }else if(i==16)
        {
            p5.setBackground(Color.white);
        }
    }
    
    public Color getBackground(int i)   //get the background colour for detect is the counter online or offline in counter class
    {
        if(i==1)
        {
            return p2.getBackground();
        }else if(i==2)
        {
            return p3.getBackground();
        }else if(i==3)
        {
            return p4.getBackground();
        }else if(i==4)
        {
            return p5.getBackground();
        }
        return Color.white;
    }
    
    private JFrame x;
    public JFrame getJFrame(){
        return x;
    }
    private JLabel b,c,d,c1,c2,c3,c4,n1,n2,n3,n4;
    private JPanel p1,p2,p3,p4,p5,bb;
    private Button a;    //create button
    // constructor
    public Customer(){
        x= new JFrame("Customer View");     //first page of the system
        x.setSize(1200,450);     //set size
        x.setLocation(800,450);     //set location
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x.setLayout(new GridLayout(2,2));
        b = new JLabel("Now Serving: ",JLabel.CENTER);
        x.add(b);
        c = new JLabel("Last Number: ",JLabel.CENTER);
        x.add(c);
        a = new Button("Take a number");
        bb=new JPanel();
        bb.add(a);
        x.add(bb);
        
        p1=new JPanel();
        p1.setLayout(new GridLayout(2,4));
        
        p2=new JPanel();
        p2.setLayout(new GridLayout(1,2));
        c1=new JLabel("Counter 1");
        p2.add(c1);
        n1=new JLabel("Current Number");
        p2.add(n1);
        
        p3=new JPanel();
        p3.setLayout(new GridLayout(1,2));
        c2=new JLabel("Counter 2");
        p3.add(c2);
        n2=new JLabel("Current Number");
        p3.add(n2);
        
        p4=new JPanel();
        p4.setLayout(new GridLayout(1,2));
        c3=new JLabel("Counter 1");
        p4.add(c3);
        n3=new JLabel("Current Number");
        p4.add(n3);
        
        p5=new JPanel();
        p5.setLayout(new GridLayout(1,2));
        c4=new JLabel("Counter 2");
        p5.add(c4);
        n4=new JLabel("Current Number");
        p5.add(n4);
        
        p1.add(p2);
        p1.add(p3);
        p1.add(p4);
        p1.add(p5);
        x.add(p1);
        //create actionlistener object so the system will listen to user input
        a.addActionListener(this); 
        
        x.add(a);
        x.setResizable(false);
        x.setVisible(true); //show when the system run
    }
}
