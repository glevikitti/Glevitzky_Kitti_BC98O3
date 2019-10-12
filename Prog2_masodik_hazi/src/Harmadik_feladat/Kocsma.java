/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Harmadik_feladat;

import java.util.Arrays;

/**
 *
 * @author Dell
 */
public class Kocsma extends Vendeglatas{
    private String[] sorlap;

    public Kocsma(String[] sorlap, String nev, int ferohelyekSzama, boolean dohanyzo) {
        super(nev, ferohelyekSzama, dohanyzo);
        this.sorlap = sorlap;
    }
    
    
    
    public Kocsma(String nev, int ferohelyekSzama, boolean dohanyzo) {
        super(nev, ferohelyekSzama, dohanyzo);
        dohanyzo=true;
    }
    
    

    public String[] getSorlap() {
        return sorlap;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.sorlap)+" "+this.getNev();
    }
    
    
}
