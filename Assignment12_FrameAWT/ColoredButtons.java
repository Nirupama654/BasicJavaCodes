package LabAssignments.Assignment12_FrameAWT;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ColoredButtons extends Frame implements ActionListener {
    Button b1 = new Button("Red");
    Button b2 = new Button("Blue");
    Button b3 = new Button("Green");
    TextField t1 = new TextField();

    public ColoredButtons(){
        t1.setBounds(100,250,500,300);
        t1.setBackground(Color.BLACK);
        b1.setBounds(50,50,100,50);
        b2.setBounds(200,50,100,50);
        b3.setBounds(350,50,100,50);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        add(b1);
        add(b2);
        add(b3);
        add(t1);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        addWindowListener(new Test());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        if(e.getSource()== b1){
            t1.setBackground(Color.RED);
        }
        if(e.getSource()== b2){
            t1.setBackground(Color.blue);
        }
        if(e.getSource()== b3){
            t1.setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        ColoredButtons c1 = new ColoredButtons();
        c1.setTitle("My Buttons");
    }

    class Test extends WindowAdapter{
        public void windowOpened(WindowEvent e) {
            System.exit(0);
        }
    }
}
