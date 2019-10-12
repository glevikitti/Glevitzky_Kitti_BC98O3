/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Budapestkupa1;

/**
 *
 * @author Dell
 */
public class Bk1 {
    
    private int ev;
    private int honap;
    private int nap;
    private String nev;
    private int resztav;

    public Bk1(int ev, int honap, int nap, String nev, int resztav) {
        this.ev = ev;
        this.honap = honap;
        this.nap = nap;
        this.nev = nev;
        this.resztav = resztav;
    }

    public int getEv() {
        return ev;
    }

    public int getHonap() {
        return honap;
    }

    public int getNap() {
        return nap;
    }

    public String getNev() {
        return nev;
    }

    public int getResztav() {
        return resztav;
    }

    @Override
    public String toString() {
        return ev+";"+honap+";"+nap+";"+nev;
    }
    
    
}
