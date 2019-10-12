/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hetedik_feladat;

/**
 *
 * @author Dell
 */
public class Orarend {
    
    public static final int HETFO=1;
    public static final int KEDD=2;
    public static final int SZERDA=3;
    public static final int CSUTORTOK=4;
    public static final int PENTEK=5;
    
    private Ora[] Orak;
    private int szamlalo;
    private int nap;

    public Orarend(int nap) {
    
        this.szamlalo = 0;
        this.Orak = new Ora[12];
        this.nap = nap;
    }

    public Ora[] getOrak() {
        return Orak;
    }

    public void setOrak(Ora[] Orak) {
        this.Orak = Orak;
    }

    public int getSzamlalo() {
        return szamlalo;
    }

    public void setSzamlalo(int szamlalo) {
        this.szamlalo = szamlalo;
    }

    public int getNap() {
        return nap;
    }

    public void setNap(int nap) {
        this.nap = nap;
    }
    
    
    public boolean oratHozzaad(Ora ora) {
        if(szamlalo == 12)
            return false;
        for (int i =0; i < szamlalo;i++) {
            if(Orak[i].getOra() == ora.getOra())
                return false;
        }
        Orak[szamlalo]=ora;
        szamlalo++;
        return true;
    
    
    }
    
}
