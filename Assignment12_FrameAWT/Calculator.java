package LabAssignments.Assignment12_FrameAWT;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Calculator extends Frame implements ActionListener  {

    TextField num1 = new TextField();
    TextField num2 = new TextField();

    Button sum = new Button("+");
    Button dif = new Button("-");
    Button pro = new Button("*");
    Button div = new Button("/");
    Button modulo = new Button("%");

    TextField result = new TextField();

    public Calculator(){
        num1.setBounds(100,50,50,50);
        num2.setBounds(200,50,50,50);
        sum.setBounds(100,150,50,50);
        dif.setBounds(150,150,50,50);
        pro.setBounds(200,150,50,50);
        div.setBounds(250,150,50,50);
        modulo.setBounds(300,150,50,50);
        result.setBounds(150,250,100,100);

        num1.addActionListener(this);
        num2.addActionListener(this);
        sum.addActionListener(this);
        dif.addActionListener(this);
        pro.addActionListener(this);
        div.addActionListener(this);
        modulo.addActionListener(this);
        add(num1);
        add(num2);
        add(sum);
        add(dif);
        add(pro);
        add(div);
        add(modulo);
        add(result);
        setSize(1000,1000);
        setLayout(null);
        setVisible(true);
        addWindowListener(new Test1());
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int c = 0 ;

        String str1 = num1.getText();
        String str2 = num2.getText();

        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);

        if(e.getSource()== sum){
           c = a+b ;
        }
        if(e.getSource()== dif){
            c = a-b ;
        }
        if(e.getSource()== pro){
           c = a*b ;
        }
        if(e.getSource()== div){
           c = a/b ;
        }
        if(e.getSource()== modulo){
            c = a%b ;
        }

        String str = String.valueOf(c);
        result.setText(str);
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setTitle("My Calculator");
    }
}
class Test1 extends WindowAdapter{
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}
