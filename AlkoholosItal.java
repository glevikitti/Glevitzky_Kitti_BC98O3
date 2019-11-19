/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public abstract class AlkoholosItal implements Alkoholos{
    private String iz;
    private double alkoholTartalom;

    public AlkoholosItal(String iz, double alkoholTartalom) {
        this.iz = iz;
        this.alkoholTartalom = alkoholTartalom;
    }
    
    public String milyenIzu(){
        return iz;
    }

    public String getIz() {
        return iz;
    }

    public double getAlkoholTartalom() {
        return alkoholTartalom;
    }
    

    @Override
    public String toString() {
        return iz+" "+alkoholTartalom;
    }

    
    public double mennyiAlkoholTartalmaz() {
        return alkoholTartalom;
    }
    
    
}
