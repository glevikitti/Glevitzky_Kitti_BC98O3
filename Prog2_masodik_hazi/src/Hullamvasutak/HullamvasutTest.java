/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hullamvasutak;

import java.util.Arrays;
import java.util.Scanner;


public class HullamvasutTest {
    private static Hullamvasut[] hv;
    
    static void rendez(Hullamvasut[] t)
    {
        for(int i=0;i<t.length-1;i++)
            for(int j=i+1;j<t.length;j++)
            {
                if(t[i].getVi()==t[j].getVi())
                    if(t[i].getLm()==t[j].getLm())
                    {
                        if(t[i].getNev().compareTo(t[j].getNev())>0)
                        {
                            Hullamvasut tmp=t[i];
                            t[i]=t[j];
                            t[j]=tmp;
                        }
                    }
                        else {
                          if(t[i].getLm()<t[j].getLm())
                              {
                                Hullamvasut tmp=t[i];
                                t[i]=t[j];
                                t[j]=tmp;
                              }
                    }
                else if(t[i].getVi()>t[j].getVi())
                    {
                                Hullamvasut tmp=t[i];
                                t[i]=t[j];
                                t[j]=tmp;
                              }
                               
                        }
   
    }
    
    static void kiir(Hullamvasut [] t)
    {
        for(int i=0;i<t.length;i++)
        {
            System.out.println(t[i].toString());
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int db = Integer.parseInt(sc.nextLine());
        hv = new Hullamvasut[db];
        for (int i = 0; i < hv.length; i++)
        {
            String sor =sc.nextLine();
            String [] tmp=sor.split(";");
            
           hv[i]=new Hullamvasut(tmp[0],tmp[1],Integer.parseInt(tmp[2]),Integer.parseInt(tmp[3]));
        }
        rendez(hv);
        kiir(hv);
        
    }
}
