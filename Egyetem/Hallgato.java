/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Egyetem;

/**
 *
 * @author Dell
 */
public class Hallgato {
    private int mennyitKeszult;
    private boolean sokatTanult;

    public Hallgato(int mennyitKeszult, boolean sokatTanult) {
        this.mennyitKeszult = mennyitKeszult;
        this.sokatTanult = sokatTanult;
    }

    public int getMennyitKeszult() {
        return mennyitKeszult;
    }

    public boolean isSokatTanult() {
        return sokatTanult;
    }

    public void setMennyitKeszult(int mennyitKeszult) {
        this.mennyitKeszult = mennyitKeszult;
    }

    public void setSokatTanult(boolean sokatTanult) {
        this.sokatTanult = sokatTanult;
    }
    
    
    
    public Dolgozat dolgozatotIr(){
        int pont=0;
        Dolgozat d;
        int lusta=(int) (50.0*Math.random());
        
        if(lusta==0){
            pont=-1;
            System.out.println("Nem írt");
        }
        
        if(sokatTanult==true){
            pont=(int)(((4.0*Math.random())+4)*mennyitKeszult);
        }
        else if(sokatTanult==false){
            pont=(int) (6.0*Math.random())*mennyitKeszult;
        }
        d= new Dolgozat(pont);
        return d;
    }

    @Override
    public String toString() {
        return mennyitKeszult + " " + sokatTanult;
    }
    
    
}
