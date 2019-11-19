/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Szamologep;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class OsszetettebSzamologep extends JFrame {
    
    private static int szamok;
    
    private JTextField tf;
    private JButton bt1,bt2,bt3,bt4,
            bt5,het,nyolc,kilenc,bt9,bt10,
            bt11,negy,ot,hat,bt15,bt16,
            bt17,egy,ketto,harom,bt21,bt22,
            bt23,nulla,bt25,bt26,plusz,egyenlo;
    
    private JPanel p1,p2,p3,p4,p5,p6,p7;
    
    private char muvelet;
    private double regi;
    
    

    public OsszetettebSzamologep() throws HeadlessException {
        super("Szamologep");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        ActionListener szamkezelo= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText()+((JButton) e.getSource()).getText());
            }
        };
        
        
        
        tf=new JTextField(20);
        
        bt1=new JButton("");
        bt2=new JButton("BACKSPACE"); 
        bt3=new JButton("CE");
        bt4=new JButton("C");
        
        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                tf.setText("");
            }
        });
        
        bt5=new JButton("MC");
        het=new JButton("7");
        het.addActionListener(szamkezelo);
        nyolc=new JButton("8");
        nyolc.addActionListener(szamkezelo);
        kilenc=new JButton("9");
        kilenc.addActionListener(szamkezelo);
        bt9=new JButton("/");
        bt10=new JButton("SQRT");
        
        bt11=new JButton("MR");
        negy=new JButton("4");
        negy.addActionListener(szamkezelo);
        ot=new JButton("5");
        ot.addActionListener(szamkezelo);
        hat=new JButton("6");
        hat.addActionListener(szamkezelo);
        bt15=new JButton("*");
        bt16=new JButton("%");
        
        bt17=new JButton("MS");
        egy=new JButton("1");
        egy.addActionListener(szamkezelo);
        ketto=new JButton("2");
        ketto.addActionListener(szamkezelo);
        harom=new JButton("3");
        harom.addActionListener(szamkezelo);
        bt21=new JButton("-");
        bt22=new JButton("1/X");
        
        bt23=new JButton("M+");
        nulla=new JButton("0");
        nulla.addActionListener(szamkezelo);
        bt25=new JButton("+/-");
        bt26=new JButton(".");
        plusz=new JButton("+");
        plusz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               double aktualitas=Double.parseDouble(tf.getText());
               double ujErtek;
               
               regi=fgvmuvelet(regi, aktualitas, muvelet);
               muvelet='+';
               tf.setText("");
            }
        });
        egyenlo=new JButton("=");
        egyenlo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                    tf.setText(Double.toString(fgvmuvelet(regi, Double.parseDouble(tf.getText()), muvelet)));
                    
                
            
            }
        });
        
       p1=new JPanel();
       p2=new JPanel();
       p3=new JPanel();
       p4=new JPanel();
       p5=new JPanel();
       p6=new JPanel();
       p7=new JPanel();
       
        GridLayout gr= new GridLayout(1,1);
        setLayout(gr);
        GridLayout gr1= new GridLayout(1,1);
        p1.setLayout(gr1);
        GridLayout gr2=new GridLayout(1,4);
        p2.setLayout(gr2);
        GridLayout gr3=new GridLayout(1,6);
        p3.setLayout(gr3);
        GridLayout gr4=new GridLayout(1,6);
        p4.setLayout(gr4);
        GridLayout gr5=new GridLayout(1,6);
        p5.setLayout(gr5);
        GridLayout gr6=new GridLayout(1,6);
        p6.setLayout(gr6);
        GridLayout gr7=new GridLayout(6,1);
        p7.setLayout(gr7);
        
        p1.add(tf);
        
        p2.add(bt1);
        p2.add(bt2);
        p2.add(bt3);
        p2.add(bt4);
        
        p3.add(bt5);
        p3.add(het);
        p3.add(nyolc);
        p3.add(kilenc);
        p3.add(bt9);
        p3.add(bt10);
        
        p4.add(bt11);
        p4.add(negy);
        p4.add(ot);
        p4.add(hat);
        p4.add(bt15);
        p4.add(bt16);
        
        p5.add(bt17);
        p5.add(egy);
        p5.add(ketto);
        p5.add(harom);
        p5.add(bt21);
        p5.add(bt22);
        
        p6.add(bt23);
        p6.add(nulla);
        p6.add(bt25);
        p6.add(bt26);
        p6.add(plusz);
        p6.add(egyenlo);
        
        p7.add(p1);
        p7.add(p2);
        p7.add(p3);
        p7.add(p4);
        p7.add(p5);
        p7.add(p6);
        
        this.add(p7);

        pack();

    }
    
    public static void main(String[] args) {
       OsszetettebSzamologep szam= new OsszetettebSzamologep();
    }

   
    
   
    public static double fgvmuvelet(double szam1, double szam2, char muvelet){
        if(muvelet=='+'){
            return szam1+szam2;
        }
        else if(muvelet=='-'){
            return szam1-szam2;
        }
        else if(muvelet=='*'){
            return szam1*szam2;
        }
        else if(muvelet=='/'){
            return szam1/szam2;
        }
        return szam2;
    }
    
}
