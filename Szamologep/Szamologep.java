/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Szamologep;

/**
 *
 * @author Dell
 */

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author hallgato
 */
public class Szamologep extends JFrame implements ActionListener {
    JLabel lb1;
    JLabel lb2;
    JLabel lb3;
    JLabel lb4;
    JLabel lb5;
    JLabel lb6;
    JLabel lb7;
    JLabel lb8;
    JLabel lb9;
    JLabel lb10;
    JLabel lb11;
    JLabel lb12;
    
    JTextField tf1;
    JTextField tf2;
    JTextField tf3;
    JTextField tf4;
    JTextField tf5;
    JTextField tf6;
    JTextField tf7;
    JTextField tf8;
    JTextField tf9;
    JTextField tf10;
    JTextField tf11;
    JTextField tf12;
    
    JButton bt;
    
    
    JPanel p1;
    JPanel p2;
    JPanel p3;

    public Szamologep(String title) throws HeadlessException {
        super(title);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lb1= new JLabel("nap");
        lb2= new JLabel("óra");
        lb3= new JLabel("perc");
        lb4= new JLabel("másodperc");
        lb5= new JLabel("nap");
        lb6= new JLabel("óra");
        lb7= new JLabel("perc");
        lb8= new JLabel("másodperc");
        lb9= new JLabel("nap");
        lb10= new JLabel("óra");
        lb11= new JLabel("perc");
        lb12= new JLabel("másodperc");
        tf1= new JTextField(30);
        tf2= new JTextField(30);
        tf3= new JTextField(30);
        tf4= new JTextField(30);
        tf5= new JTextField(30);
        tf6= new JTextField(30);
        tf7= new JTextField(30);
        tf8= new JTextField(30);
        tf9= new JTextField(30);
        tf10= new JTextField(30);
        tf11= new JTextField(30);
        tf12= new JTextField(30);
        bt= new JButton("Számol");
        bt.addActionListener(this);
        p1= new JPanel();
        p2= new JPanel();
        p3= new JPanel();
        
        GridLayout gr1 = new GridLayout(2,4); //p1-é lesz
        GridLayout gr2= new GridLayout(1,1);//p2
        GridLayout gr3= new GridLayout(1,4); 
        GridLayout gr4= new GridLayout(4,4);
        
        p1.setLayout(gr1);
        p2.setLayout(gr2);
        p3.setLayout(gr3);
        this.setLayout(gr4);
        p1.add(tf1);
        p1.add(lb1);
        p1.add(tf2);
        p1.add(lb2);
        p1.add(tf3);
        p1.add(lb3);
        p1.add(tf4);
        p1.add(lb4);
        p1.add(tf5);
        p1.add(lb5);
        p1.add(tf6);
        p1.add(lb6);
        p1.add(tf7);
        p1.add(lb7);
        p1.add(tf8);
        p1.add(lb8);
        
        
        p2.add(bt);
        p3.add(tf9);
        p3.add(lb9);
        p3.add(tf10);
        p3.add(lb10);
        p3.add(tf11);
        p3.add(lb11);
        p3.add(tf12);
        p3.add(lb12);
        
        this.add(p1);
        this.add(p2);
        this.add(p3);
        
        pack(); //automatikusan méretez
    }
    
    public static void main(String[] args) {
        Szamologep l= new Szamologep("Idoatalakito");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        int masodpercek=0;
        int percek=0;
        int orak=0;
        int napok=0;
        
        tf12.setText("0");
        tf11.setText("0");
        tf10.setText("0");
        tf9.setText("0");
        
        masodpercek=Integer.parseInt(tf4.getText())+Integer.parseInt(tf8.getText());
        int maradek1=0;
        if(masodpercek<60){
            tf12.setText(Integer.toString(masodpercek));
        }
        else if(masodpercek>60){
            tf12.setText(Integer.toString(masodpercek%60));
            percek=masodpercek/60;
        }
        percek+=Integer.parseInt(tf3.getText())+Integer.parseInt(tf7.getText());
        int maradek2=0;
        if(percek<60){
            tf11.setText(Integer.toString(percek));
        }
        else if(percek>60){
            tf11.setText(Integer.toString(percek%60));
            orak=percek/60;
        }
        orak+=Integer.parseInt(tf2.getText())+Integer.parseInt(tf6.getText());
        int maradek3=0;
        
        if(orak<24){
            tf10.setText(Integer.toString(orak));
        }
        else if(orak>24){
            tf10.setText(Integer.toString(orak%24));
            napok=orak/24;
        }
        napok+=Integer.parseInt(tf1.getText())+Integer.parseInt(tf5.getText());
        tf9.setText(Integer.toString(napok));
        
    }
    
   
    
}


