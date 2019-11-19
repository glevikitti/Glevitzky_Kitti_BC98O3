/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parkolo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Test {
    public static void main(String[] args) {
        List<Parkolo> lista=new ArrayList();
        
        Scanner sc=new Scanner(System.in);
        String sor=sc.nextLine();
        int db=0;
        int szamol = 0;
        
        while(sor.length()>0) {
            
            String [] st=sor.split(";");
            
            for(int i=0;i<st.length-3;i++) {
                db++;
            }
            lista.add(new Parkolo(st[0],Integer.parseInt(st[1]),Integer.parseInt(st[2]),db));
            
            
            sor=sc.nextLine();
            
        }
        Collections.sort(lista);
        for (Parkolo p : lista) {
            if(p.getSzabadhely()>3){
            System.out.println(p);
            }
        }
        
    }
}
