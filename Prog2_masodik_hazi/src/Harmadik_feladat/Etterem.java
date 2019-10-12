/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Harmadik_feladat;

/**
 *
 * @author Dell
 */
public class Etterem extends Vendeglatas{
    private String[] etlap;

    public Etterem(String[] etlap, String nev, int ferohelyekSzama, boolean dohanyzo) {
        super(nev, ferohelyekSzama, dohanyzo);
        this.etlap = etlap;
    }

    public Etterem(String nev, int ferohelyekSzama, boolean dohanyzo) {
        super(nev, ferohelyekSzama, dohanyzo);
        dohanyzo=false;
    }
    
    

    
    
    

    public String[] getEtlap() {
        return etlap;
    }

    @Override
    public String toString() {
        return "etlap"+etlap;
    }
    
    
    
}
