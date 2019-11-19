/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ital;

import java.util.Objects;

/**
 *
 * @author Dell
 */
public class Ital implements Comparable<Ital>{
    protected String név;
    protected String kiszerelés;
    protected int ár;

    public Ital(String név, String kiszerelés, int ár) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.ár = ár;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public void setKiszerelés(String kiszerelés) {
        this.kiszerelés = kiszerelés;
    }

    public int getÁr() {
        return ár;
    }

    public void setÁr(int ár) {
        this.ár = ár;
    }

    @Override
    public String toString() {
        return név+", "+kiszerelés+", "+ár+" Ft";
    }
    
    

    

    @Override
    public boolean equals(Object obj) {
        if(obj==null||!(obj instanceof Ital))
            return false;
        
        Ital masik=(Ital) obj;
        if(this.név.equals(masik.név)&&this.kiszerelés.equals(masik.kiszerelés))
            return true;
        else return false;
    }

    
    @Override
    public int compareTo(Ital t) {
        return Double.compare(this.ár, t.getÁr());
    }
    
    
}
