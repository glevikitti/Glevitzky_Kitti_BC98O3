/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KoPapirOllo;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Jatek {
    
    
    
    
    public static void main(String[] args) {
        
        int jatekos = 0;
        int gep = 0;
        int i=0;
        String ko="kő";
        String ollo="olló";
        String papir="papír";
        
        Scanner sc= new Scanner(System.in);
        String sor=sc.nextLine();
        if(sor.equals("vége")){
             System.out.println("Játék vége");}
        if(sor.equals(ko)){
            jatekos=0;
            gep= (int)(3.0 * Math.random());
            System.out.println(jatekos+" "+gep);
            
        }
        
        if(sor.equals(papir)){
            jatekos=1;
            gep= (int)(3.0 * Math.random());
            System.out.println(jatekos+" "+gep);
        }
        
        if(sor.equals(ollo)){
            jatekos=2;
            gep= (int)(3.0 * Math.random());
            System.out.println(jatekos+" "+gep);
        }
        
        if(jatekos==2 && gep==1 || jatekos==1 && gep==0 || jatekos==0 && gep==2)
            System.out.println("A játékos nyert");
        else System.out.println("A gép nyert");
        
        if(jatekos==1 && gep==1 || jatekos==0 && gep==0 || jatekos==2 && gep==2)
            System.out.println("Döntetlen");
        
//        for (i=1;i<2;i++) {
//            
//        
//        Scanner sc= new Scanner(System.in);
//        String sor=sc.nextLine();
//        //if(!(sor.equals("kő") || sor.equals("papír") || sor.equals("olló") || sor.equals("vége")))
//        if(sor.equals("kő"))
//                System.out.println("hkjhkj");
//        else if(sor.equals("vége")){
//            System.out.println("");
//            i++;
//        }
//        else if(sor.equals("kő")) {
//            jatekos=0;
//            gep=(int) Math.random()*(3-0);
//            //Random r = new Random();
//            System.out.println("gep + jatekos");
//            i++;
//        }
//        else if(sor.equals("papír")) {
//            jatekos=1;
//            gep=1;
//            //Random r = new Random();
//            System.out.println(gep);
//        }
//            else if(sor.equals("olló")) {
//            jatekos=2;
//            gep=(int) Math.random()*(3-0);
//            //Random r = new Random();
//            System.out.println(gep);
//        }
//
//        }
//        
//    }
//


    
     
    
    }
}
