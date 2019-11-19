/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hatodik;

/**
 *
 * @author Dell
 */
public class Dolgozat implements Pontozhato{
    private int pontszam;

    public Dolgozat(int pontszam) {
        this.pontszam = pontszam;
    }

    public int getPontszam() {
        return pontszam;
    }

    public void setPontszam(int pontszam) {
        this.pontszam = pontszam;
    }
    
    

    @Override
    public boolean megfelelt() {
        if(pontszam>35)
            return true;
        else if(pontszam==-1){
            
            System.out.println("Nem írt dologzatot");
            return false;
        }
        
        else return false;
    }

    @Override
    public String toString() {
        return Integer.toString(pontszam) ;
    }
    
    
    
    
}
