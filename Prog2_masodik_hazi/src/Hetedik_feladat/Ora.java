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
public class Ora {
    private int kod;
    private String nev;
    private int ora;

    public Ora(int kod, String nev, int ora) {
        this.kod = kod;
        this.nev = nev;
        if(this.ora<8 && this.ora>1)
            this.ora=8;
        if(this.ora>19 ||this.ora<2)
            this.ora=19;
        
        this.ora = ora;
    }

    public int getKod() {
        return kod;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getOra() {
        return ora;
    }

    

    public void setOra(int ora) {
        this.ora = ora;
    }

    @Override
    public String toString() {
        return "Ora{" + "kod=" + kod + ", nev=" + nev + ", ora=" + ora + '}';
    }
    
    
    
}
