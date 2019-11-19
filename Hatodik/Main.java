/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hatodik;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int darabszam= Integer.parseInt(sc.nextLine());
        Dolgozat [] d= new Dolgozat[darabszam];
        Hallgato[] h= new Hallgato[darabszam];
        
        for (int i = 0; i < h.length; i++) {
            String[] sor= sc.nextLine().split(",");
            h[i]= new Hallgato(Integer.parseInt(sor[0]),Boolean.parseBoolean(sor[1]));
            if(sor[1].equals("igaz")){
                h[i].setSokatTanul(true);
            }
            else if(sor[1].equals("hamis")){
                h[i].setSokatTanul(false);
            }
            
        }
        for (int i = 0; i < d.length; i++) {
            d[i]=h[i].dolgozatotIr();
        }
        
        for (int i = 0; i < d.length-1; i++) {
            if(d[i].megfelelt() && d[i+1].megfelelt()==true){
                System.out.println("Megfelet");
            }
            else {
                System.out.println("Nem felelt meg");
            }
            
            
            if(d[i].getPontszam()==-1){
                System.out.println("Nem jelent meg");
            }
        }
    }
}
