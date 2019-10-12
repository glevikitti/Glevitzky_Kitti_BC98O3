/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hullamvasutak;

/**
 *
 * @author Dell
 */
public class Hullamvasut {
    private String nev;
    private String vilag;
    private int lm;
    private int vi;

    public Hullamvasut(String nev, String vilag, int lm, int vi) {
        this.nev = nev;
        this.vilag = vilag;
        this.lm = lm;
        this.vi = vi;
    }

    public String getNev() {
        return nev;
    }

    public String getVilag() {
        return vilag;
    }

    public int getLm() {
        return lm;
    }

    public int getVi() {
        return vi;
    }

    @Override
    public String toString() {
        return nev +" ("+ vilag+"): "+vi;
    }
    
    
    
}
