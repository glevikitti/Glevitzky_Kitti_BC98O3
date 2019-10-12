/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Katona;

/**
 *
 * @author Dell
 */
public class Nyilas extends Katona {
    private int lotav;

    public Nyilas(int lotav, int tamadoero, int vedoero) {
        super(tamadoero, vedoero);
        this.lotav = lotav;
    }

    public int getLotav() {
        return lotav;
    }

    public void setLotav(int lotav) {
        this.lotav = lotav;
    }

    public int getTamadoero1() {
        return getTamadoero()+lotav;
    }
    
    public int getVedoero1() {
        return getVedoero();
    }

    @Override
    public String toString() {
        return "Nyilas TE:["+getTamadoero1()+"] VE:["+getVedoero1()+"]";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Nyilas)) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Nyilas masik = (Nyilas) obj;
        if (this.lotav == masik.lotav && this.getTamadoero1()==masik.getTamadoero1() && this.getVedoero1()==masik.getVedoero1()) {
            return true;
        }
        else return false;
    }
    
    
    
    
}
