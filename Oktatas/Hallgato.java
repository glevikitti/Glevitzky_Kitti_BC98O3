/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oktatas;

/**
 *
 * @author Dell
 */
public class Hallgato extends Személy{
    private double atlag=0;
    private double hatar;

    public Hallgato(double atlag, String név, int életkor, boolean férfi) {
        super(név, életkor, férfi);
        this.atlag = atlag;
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append(getNév()).append("/n");
        sb.append(getÉletkor()).append("/n");
        sb.append(isFérfi()).append("/n");
        sb.append(atlag);
        
        return sb.toString();
    }

    public void setHatar(double hatar) {
        this.hatar = hatar;
    }

    
    
    public boolean jokepessegu(){
        setHatar(this.hatar);
        if(atlag>hatar)
            return true;
        else return false;
       
    }
    
    
}
