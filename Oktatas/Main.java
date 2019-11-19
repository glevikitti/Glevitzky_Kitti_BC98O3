/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oktatas;


import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Dell
 */
public class Main {
    
    public static double jotanulo(Set<Személy> tanulo){
        int eletkorosszeg=0;
        int darab=0;
        
        
        for (Személy sz : tanulo) {
            if(sz instanceof Hallgato){
                Hallgato h= (Hallgato) sz;
                darab++;
                eletkorosszeg+=h.életkor;
            }
            
        }
        return eletkorosszeg/darab;
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Személy sz= new Személy("Mona Lisa",20,false);
        
        System.out.println(sz);
        
        Személy [] szem= new Személy[4];
        
        for (int i = 0; i < szem.length; i++) {
            String[] sor= sc.nextLine().split(" ");
            
            szem[0]=new Hallgato(Double.parseDouble(sor[0]),sor[1],Integer.parseInt(sor[2]),Boolean.parseBoolean(sor[3]));
            szem[1]=new Hallgato(Double.parseDouble(sor[0]),sor[1],Integer.parseInt(sor[2]),Boolean.parseBoolean(sor[3]));
            szem[2]=new Oktato(sor[0],sor[1],Integer.parseInt(sor[2]),Boolean.parseBoolean(sor[3]));
            szem[3]=new Oktato(sor[0],sor[1],Integer.parseInt(sor[2]),Boolean.parseBoolean(sor[3]));
        }
        
        
    }
}
