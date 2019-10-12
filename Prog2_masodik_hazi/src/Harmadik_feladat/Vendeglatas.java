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
public class Vendeglatas {
    
    private String nev;
    private int ferohelyekSzama;
    private boolean dohanyzo;

    public Vendeglatas(String nev, int ferohelyekSzama, boolean dohanyzo) {
        this.nev = nev;
        this.ferohelyekSzama = ferohelyekSzama;
        this.dohanyzo = dohanyzo;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getFerohelyekSzama() {
        return ferohelyekSzama;
    }

    public void setFerohelyekSzama(int ferohelyekSzama) {
        this.ferohelyekSzama = ferohelyekSzama;
    }

    public boolean isDohanyzo() {
        return dohanyzo;
    }

    public void setDohanyzo(boolean dohanyzo) {
        this.dohanyzo = dohanyzo;
    }

    @Override
    public String toString() {
        return "nev=" + nev + ", ferohelyekSzama=" + ferohelyekSzama + ", dohanyzo=" + dohanyzo ;
    }
    
    
    
}
