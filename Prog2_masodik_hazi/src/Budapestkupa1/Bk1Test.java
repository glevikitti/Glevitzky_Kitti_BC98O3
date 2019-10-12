/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Budapestkupa1;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Bk1Test {
    
    private static Bk1[] tomb;
    
    static void rendez(Bk1 t[])
    {
        for(int i=0;i<t.length-1;i++)
            for(int j=i+1;j<t.length;j++){
                if(t[i].getResztav()==t[j].getResztav())
                    if(t[i].getEv()==t[j].getEv()){
                        if(t[i].getHonap()==t[j].getHonap()){
                            if(t[i].getNap()==t[j].getNap()){
                                if(t[i].getNev().compareTo(t[j].getNev())>1){
                                    Bk1 tmp=t[i];
                                    t[i]=t[j];
                                    t[j]=tmp;
                                }
                                else if(t[i].getNap()>t[j].getNap()){
                                    Bk1 tmp=t[i];
                                    t[i]=t[j];
                                    t[j]=tmp;
                                }
                                    
                                
                                    
                            }
                            else if(t[i].getHonap()>t[j].getHonap()){
                                Bk1 tmp=t[i];
                                t[i]=t[j];
                                t[j]=tmp;
                            }
                        }
                        else if(t[i].getEv()>t[j].getEv()){
                            Bk1 tmp=t[i];
                            t[i]=t[j];
                            t[j]=tmp;
                        }
                            
                    }
                    else if(t[i].getResztav()>t[j].getResztav()){
                        Bk1 tmp=t[i];
                        t[i]=t[j];
                        t[j]=tmp;
                    }
            }
    
    }            
                
            static void kiir(Bk1 t[])
            {
                for(int i=0;i<t.length;i++)
        {
            System.out.println(t[i].toString());
        }
            }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int db = Integer.parseInt(sc.nextLine());
        String[] Resztav=new String[db];
        for (int i = 0; i < db; i++) {
            Scanner sor = new Scanner(sc.nextLine()).useDelimiter(";");
            String resztav=sor.next();
            Resztav[i]=resztav;
            
        }
        for (int i = 4; i < db; i++) {
            db++;
            
        }
        tomb=new Bk1[db];
        for (int i = 0; i < tomb.length; i++){
            String sor =sc.nextLine();
            String [] tmp=sor.split(";");
            tomb[i]=new Bk1(Integer.parseInt(tmp[0]),Integer.parseInt(tmp[1]),Integer.parseInt(tmp[2]),tmp[3],Integer.parseInt(tmp[4]));
        }
    }
    
}
