/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Aszu extends Bor{
    private int puttonyszam;

    public Aszu(int puttonyszam, String szolofajta, String termoTerulet, String iz, double alkoholTartalom) {
        super(szolofajta, termoTerulet, iz, alkoholTartalom);
        this.puttonyszam = puttonyszam;
    }

    
    
    public int hanyPuttonyos(){
        return puttonyszam;
    }

    @Override
    public String toString() {
        return super.toString()+" "+Integer.toString(puttonyszam) ;
    }
    
    
}
