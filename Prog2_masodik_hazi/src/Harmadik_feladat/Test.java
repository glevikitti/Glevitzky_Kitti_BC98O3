/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Harmadik_feladat;

import java.util.Arrays;

/**
 *
 * @author Dell
 */
public class Test {
    public static Kocsma[] adottItal(String ital, Vendeglatas[] kt)
        {
           
            int k=0;
            for(int i=0;i<kt.length;i++)
            {
                if(kt[i] instanceof Kocsma)
                {
                    Kocsma ko=(Kocsma)kt[i];
                    for(int j=0;j<ko.getSorlap().length;j++)
                        if(ko.getSorlap()[j].equals(ital))
                            k++;
                }
            }
           
            Kocsma [] kocsma = new Kocsma[k];
            k=0;
            for(int i=0;i<kt.length;i++)
            {
                if(kt[i] instanceof Kocsma)
                {
                    Kocsma ko=(Kocsma)kt[i];
                    for(int j=0;j<ko.getSorlap().length;j++)
                        if(ko.getSorlap() [j].equals(ital))
                        {
                            kocsma[k]=ko;
                            k++;
                        }
                }
            }
            return kocsma;
        }
    public static void main(String[] args) {
       
       
        Vendeglatas [] ve= new Vendeglatas[] {
            new Kocsma(new String[] {"Barna","Citromos","Cola"},"K1",50,true),
            new Kocsma(new String[] {"Barna","Citromos","Világos"},"K2",35,false),
            new Kocsma(new String[] {"Barna","Citromos","Szénsavasvíz"},"K3",80,true),
            new Kocsma(new String[] {"Barna","Citromos","Csapolt"},"K4",40,false),
            new Kocsma(new String[] {"Barna","Citromos","Habos"},"K5",60,true),
            new Etterem(new String[] {"Rántotthús","Sültkrumpli","Rizs"},"E1",100,false),
            new Etterem(new String[] {"Rántottsajt","Tartármártás","Krumplippüré"},"E2",80,false),
            new Etterem(new String[] {"Rántotthal","Uborkasaláta","Rizibizi"},"E3",110,false),
            new Etterem(new String[] {"Csirkepörkölt","Nokedli","Saláta"},"E4",80,false),
            new Etterem(new String[] {"Gulyásleves","Fánk","Csokiöntet"},"E5",90,false)
        };
       
        System.out.println(Arrays.toString(adottItal("Barna",ve)));
    }
}
