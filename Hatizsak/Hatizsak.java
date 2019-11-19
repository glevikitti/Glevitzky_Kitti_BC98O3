/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hatizsak;

import java.util.Objects;

/**
 *
 * @author Dell
 */
public class Hatizsak implements Comparable<Hatizsak>{
    private String marka;
    private double urtartalom;
    private int zsebekSzama;
    private boolean vizhatlan;

    public Hatizsak(String marka, double urtartalom, int zsebekSzama, boolean vizhatlan) {
        this.marka = marka;
        this.urtartalom = urtartalom;
        this.zsebekSzama = zsebekSzama;
        this.vizhatlan = vizhatlan;
    }

    public String getMarka() {
        return marka;
    }

    public double getUrtartalom() {
        return urtartalom;
    }

    public int getZsebekSzama() {
        return zsebekSzama;
    }

    public boolean isVizhatlan() {
        return vizhatlan;
    }

    @Override
    public String toString() {
        return marka+" "+urtartalom+" "+zsebekSzama+" "+vizhatlan;
    }

    @Override
    public int compareTo(Hatizsak h) {
        if(this.marka.equals(h.getMarka())){
         return -1*Integer.compare(this.zsebekSzama, h.zsebekSzama);
         
     }
         return this.marka.compareTo(h.getMarka());
    }

    

    @Override
    public boolean equals(Object obj) {
        if (obj==null || !(obj instanceof Hatizsak)){
            return false;
        }
        
        Hatizsak h= (Hatizsak) obj;
        
        if(h.getMarka().compareTo(this.marka)==0 && h.getUrtartalom()==this.urtartalom)
            return true;
        else return false;
    }
    
    
    
}
