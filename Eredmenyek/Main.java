/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eredmenyek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        List<Hallgato> h= new ArrayList<>();
        
        while(sc.hasNextLine()){
            String[] s= sc.nextLine().split(";");
            
            Hallgato ha= new Hallgato(s[0],Integer.parseInt(s[1]));
            
            if(h.contains(ha)){
                int idx=h.indexOf(ha);
                h.get(idx).setPontszam(h.get(idx).getPontszam()+Integer.parseInt(s[1]));
            }
            else{
                h.add(ha);
            }
        }
        
        Collections.sort(h);
        
        for (Hallgato hallgato : h) {
            System.out.println(hallgato);
        }
    }
    
}
