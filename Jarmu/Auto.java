/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jarmu;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author Dell
 */
public class Auto implements Comparable<Auto>{
 private String rendszám;
 private int teljesítmény;
 private boolean automata;
 private int darab;
 private List<String> extra;

    public Auto(String rendszám, int teljesítmény, boolean automata,List<String> extra) {
        this.rendszám = rendszám;
        this.teljesítmény = teljesítmény;
        this.automata = automata;
        darab++;
        extra= null;
    }

    public String getRendszám() {
        return rendszám;
    }

    public int getTeljesítmény() {
        return teljesítmény;
    }

    public boolean isAutomata() {
        return automata;
    }

    @Override
    public String toString() {
        return rendszám+" "+teljesítmény+" "+automata;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Auto))
            return false;
        Auto a= (Auto) obj;
        if(this.rendszám.compareTo(a.getRendszám())==0)
            return true;
        else return false;
    }

    @Override
    public int compareTo(Auto t) {
       return Integer.compare(this.teljesítmény,t.teljesítmény);
    }
    
    
 
 
}
