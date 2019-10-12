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
public class Landzsas extends Katona{

    public Landzsas(int tamadoero, int vedoero) {
        super(tamadoero, vedoero);
    }
    public int getTamadoero2() {
        return getTamadoero();
    }
    
    public int getVedoero2() {
        return getVedoero();
    }

    @Override
    public String toString() {
        return "Landzsas TE:["+getTamadoero2()+"] VE:["+getVedoero2()+"]";
    }
    
    
}
