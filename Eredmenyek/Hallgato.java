/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eredmenyek;

/**
 *
 * @author Dell
 */
public class Hallgato implements Comparable<Hallgato>{
    private String nev;
    private int pontszam;

    public Hallgato(String nev, int pontszam) {
        this.nev = nev;
        this.pontszam = pontszam;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getPontszam() {
        return pontszam;
    }

    public void setPontszam(int pontszam) {
        this.pontszam = pontszam;
    }

    @Override
    public String toString() {
        return nev+": "+pontszam+" pont";
    }

    @Override
    public int compareTo(Hallgato t) {
         if(this.pontszam==t.getPontszam())
            return this.nev.compareTo(t.getNev());
        else 
            return (-1)*Integer.compare(this.pontszam,t.getPontszam());}
    
}
