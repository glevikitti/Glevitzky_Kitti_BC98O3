/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hatodik;

import java.util.Random;

/**
 *
 * @author Dell
 */
public class Hallgato {
    private int mennyitKeszult;
    private boolean sokatTanul;

    public Hallgato(int mennyitKeszult, boolean sokatTanul) {
        this.mennyitKeszult = mennyitKeszult;
        this.sokatTanul = sokatTanul;
    }

    public int getMennyitKeszult() {
        return mennyitKeszult;
    }

    public void setMennyitKeszult(int mennyitKeszult) {
        this.mennyitKeszult = mennyitKeszult;
    }

    public boolean isSokatTanul() {
        return sokatTanul;
    }

    public void setSokatTanul(boolean sokatTanul) {
        this.sokatTanul = sokatTanul;
    }
    
    
    
    public Dolgozat dolgozatotIr(){
        Dolgozat d= null;
        int sok=0;
        Random r= new Random();
        
        if(sokatTanul){
            sok=(r.nextInt((7-4)+1)+4)*mennyitKeszult;
        }
        else if(sokatTanul==false){
            sok=(r.nextInt((5-0)+1)+0)*mennyitKeszult;
        }
        else {
            sok=-1;
            System.out.println("Nem írt");
        
        }
        return d= new Dolgozat(sok);
    }
    
}
