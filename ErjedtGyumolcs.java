/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class ErjedtGyumolcs extends Gyumolcs implements Alkoholos{
    private double alkoholtartalom;

    public ErjedtGyumolcs(double alkoholtartalom, String fajta, String iz) {
        super(fajta, iz);
        this.alkoholtartalom = alkoholtartalom;
    }

    @Override
    public String toString() {
        return alkoholtartalom+" "+getFajta()+" "+getIz();
    }

    @Override
    public double mennyiAlkoholTartalmaz() {
        return alkoholtartalom;
    }
    
    
}
