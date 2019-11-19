/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oktatas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Dell
 */
public class Egyetem {
    List<Személy> egyetem= new ArrayList<>();
    
    public void legfiatalabb(List<Személy> li){
        
        List<Hallgato> hal= new ArrayList<>();
        for (Személy sz : li) {
            if(sz instanceof Hallgato){
                Hallgato h= (Hallgato) sz;
                hal.add(h);
            }
        }
        
        Collections.sort(hal);
        
        if(hal.size()<3){
            for (Hallgato hallgato : hal) {
                System.out.println(hallgato);
            }
        }
        else {
            for (int i = 0; i < 3; i++) {
                System.out.println(hal.get(i));
                
            }
                
            }
        }
    public void ITno(List<Személy> oktatok){
        List<Oktato> oktato= new ArrayList<>();
        
        for (Személy sz : oktatok) {
            if(sz instanceof Oktato){
                Oktato okt= (Oktato) sz;
                oktato.add(okt);
            }
        }
        
        for (int i = 0; i < oktato.size(); i++) {
            if(oktato.get(i).getTanszek().equals("IT") && oktato.get(i).isFérfi()==false){
                oktato.get(i).setNév(oktato.get(i).getNév()+"!");
            }
            
        }
    }
    
    
    
    }

