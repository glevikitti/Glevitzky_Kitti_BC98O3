/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Turautvonalak;


import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class TuraTest {
    private static Tura[] tomb;
    
    static void rendez(Tura[] t)
    {
        for(int i=0;i<t.length-1;i++)
            for(int j=i+1;j<t.length;j++)
                if(t[i].kek==t[j].kek)
                    if(t[i].helyi==t[j].helyi){
                        
                        if(t[i].nev.compareTo(t[j].nev)>1)
                        {
                            Tura tmp=t[i];
                            t[i]=t[j];
                            t[j]=tmp;
                        }
                    }
         else {
                          if(t[i].helyi<t[j].helyi)
                              {
                                Tura tmp=t[i];
                                t[i]=t[j];
                                t[j]=tmp;
                              }
                    }
         else {
                          if(t[i].kek<t[j].kek)
                              {
                                Tura tmp=t[i];
                                t[i]=t[j];
                                t[j]=tmp;
                              }
                    }
    }
    
    static void kiir(Tura [] t)
    {
        for(int i=0;i<t.length;i++)
        {
            System.out.println(t[i].toString());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int db = Integer.parseInt(sc.nextLine());
        tomb= new Tura[db];
        for (int i = 0; i < tomb.length; i++) {
            String[] sor = sc.nextLine().split(";");
            tomb[i] = new Tura(sor[0], sor[1]);
        }
        rendez(tomb);
        kiir(tomb);
        
    }
}
