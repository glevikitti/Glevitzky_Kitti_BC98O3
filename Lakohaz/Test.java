/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lakohaz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



/**
 *
 * @author Dell
 */
public class Test {
    static List<Lakohaz> tagasLakohazak(List<Lakohaz> l,double terfogat){
        List<Lakohaz> lako= new ArrayList<>();
        for(Lakohaz li: l){
            if(li.legkobmeter()> terfogat)
                lako.add(li);
        }
        return lako;
    }
    
    public static void main(String[] args) {
        List<Lakohaz> l= new ArrayList<Lakohaz>();
        l.add(new Lakohaz("Kassai út 10",10,60));
        l.add(new Lakohaz("Hadházi út 30",5,40));
        l.add(new Lakohaz("Böszörményi út 35",7,40));
        l.add(new Lakohaz("Füredi út 45",8,40));
        l.add(new Lakohaz("Kishegyesi út 30",10,35));
        l.add(new Lakohaz("Kishegyesi út 32",10,40));
        l.add(new Lakohaz("Diószegi út 30",10,36));
        l.add(new Lakohaz("Mikepércsi út 25",10,40));
        l.add(new Lakohaz("Sámsoni út 30",5,40));
        l.add(new Lakohaz("Vámospércsi út 30",5,40));
        
        List<Lakohaz> lakos=tagasLakohazak(l, 1000);
        
        Collections.sort(lakos);
        
        for (Lakohaz la: lakos) {
            System.out.println(la);
            
            
        }
        
        
    }
    
}
