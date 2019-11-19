/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vizgyujto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Dell
 */
public class Vizgyujto {
    private String nev;
    private List<String> belefolyok;

    public Vizgyujto(String nev) {
        this.nev = nev;
        this.belefolyok = new ArrayList<>();
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public List<String> getBelefolyok() {
        return belefolyok;
    }

    public void setBelefolyok(List<String> belefolyok) {
        this.belefolyok = belefolyok;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Vizgyujto)){
            return false;
        }
        
        Vizgyujto viz= (Vizgyujto) obj;
        
        if(this.nev.equals(viz.nev)){
            return true;
        }
        else return false;
    }

    
    
    
    
}
