import java.util.*;
import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.Dimension;

import java.awt.Color;

//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JTextArea;
//import javax.swing.JButton;


public class Calculator
{
    JFrame frame =new JFrame();
    JPanel panel =new JPanel();
    JTextArea text =new JTextArea(2,10);
    
    
    JButton btn1 = new JButton();
    JButton btn2 = new JButton();
    JButton btn3 = new JButton();
    JButton btn4 = new JButton();
    JButton btn5 = new JButton();
    JButton btn6 = new JButton();
    JButton btn7 = new JButton();
    JButton btn8 = new JButton();
    JButton btn9 = new JButton();
    JButton btn0 = new JButton();
    
    JButton btnplus = new JButton();
    JButton btnsub = new JButton();
    JButton btnmul = new JButton();
    JButton btndiv = new JButton();
    JButton btnclear = new JButton();
    
    JButton btndot = new JButton();
    JButton btnequal = new JButton();
    
    double num1,num2,result;
    int addc=0,mulc=0,divc=0,subc=0;
    
    public Calculator()
    {
       frame.setSize(340,450);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
       frame.setTitle("Juwel's Calculator");
       
       frame.add(panel);
       panel.setBackground(Color.LIGHT_GRAY);
       Border border= BorderFactory.createLineBorder(Color.RED,4);
       
       panel.add(text);
       text.setBackground(Color.BLACK);
       
       Border tborder = BorderFactory.createLineBorder(Color.BLUE,3);
       text.setBorder(tborder);
       
       //Font font = new Font("arial",Font.BOLD,33);
      // text.setFont();
      
       text.setForeground(Color.WHITE);
       text.setPreferredSize(new Dimension(2,10));
       text.setLineWrap(true);
       
       
       btn1.setSize(50,50);
       panel.add(btn1);
       
       
    }
    
    
    public static void main(String[]args)
    {
        Calculator c = new Calculator();
        
       
    }
    
}
