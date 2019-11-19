/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hatizsak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Dell
 */
public class Main {
    public static List<Hatizsak> kiírMárkaSzerintLexikografikusanAzonBelülZsebekSzámaSzerintCsökkenőSorrendben(List<Hatizsak> l) {
      
     
        Collections.sort(l);
        
        return l;
    }
    
    public static void main(String[] args) {
        List<Hatizsak> h= new ArrayList<>();
       h.add(new Hatizsak("Nike a", 15, 6, true));
       h.add(new Hatizsak("Adidas a", 14, 5, true));
       h.add(new Hatizsak("Budmil a", 16, 5, true));
       h.add(new Hatizsak("Nike b", 14, 8, true));
       h.add(new Hatizsak("Adidas b", 14, 5, true));
       h.add(new Hatizsak("Adidas c", 14, 7, true));
       h.add(new Hatizsak("Umbro a", 20, 5, true));
       
       kiírMárkaSzerintLexikografikusanAzonBelülZsebekSzámaSzerintCsökkenőSorrendben(h);
        
        for (Hatizsak hatizsak : h) {
            System.out.println(hatizsak);
            
        }
        
    }
}
