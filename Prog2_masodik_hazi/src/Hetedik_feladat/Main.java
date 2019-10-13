/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hetedik_feladat;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Main {
    public static void main(String[] args) {
    
        int oranap=0;
        int oraszam=0;
        
        Scanner sc=new Scanner(System.in);
        String[] adatok = sc.nextLine().split(";");
        oranap=Integer.parseInt(adatok[0]);
        oraszam=Integer.parseInt(adatok[1]);
        Ora oraterv[] = new Ora[oraszam];
        String[] tmp = null;
        for(int i = 0;i<oraszam;i++){
            String sor = sc.nextLine();
            tmp = sor.split(";");
            
            oraterv[i]=new Ora(Integer.parseInt(tmp[0]),tmp[1],Integer.parseInt(tmp[2]));
        }
                    
        
        Orarend aktualis = new Orarend(oranap);
        for(int i=0;i<oraterv.length;i++){
            
            if (aktualis.oratHozzaad(oraterv[i])==true) 
                System.out.println("sikeres volt");
            else System.out.println("nem volt sikeres");}
    }
    
}

