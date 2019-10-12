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
public class Katona {
    
    private int tamadoero;
    private int vedoero;

    public Katona(int tamadoero, int vedoero) {
        this.tamadoero = tamadoero;
        this.vedoero = vedoero;
    }

    public int getTamadoero() {
        return tamadoero;
    }

    public void setTamadoero(int tamadoero) {
        this.tamadoero = tamadoero;
    }

    public int getVedoero() {
        return vedoero;
    }

    public void setVedoero(int vedoero) {
        this.vedoero = vedoero;
    }

    @Override
    public String toString() {
        return "TE: ["+tamadoero+"] VE: ["+vedoero+"]";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Katona)|| obj==null) {
            return false;
        }
        Katona masik=(Katona) obj;
        if(this.tamadoero==masik.tamadoero&&this.vedoero==masik.vedoero)
            return true;
        else return false;
    }
}
