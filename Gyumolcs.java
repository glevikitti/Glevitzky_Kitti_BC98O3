/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Gyumolcs {
    private String fajta;
    private String iz;
    
    

    public String getFajta() {
        return fajta;
    }

    public void setFajta(String fajta) {
        this.fajta = fajta;
    }

    public String getIz() {
        return iz;
    }

    public void setIz(String iz) {
        this.iz = iz;
    }
    
    

    public Gyumolcs(String fajta, String iz) {
        this.fajta = fajta;
        this.iz = iz;
    }
    
    public String milyenFajtaju(){
        return fajta;
    }
    
    public String milyenIzu(){
        return iz;
    }

    @Override
    public String toString() {
        return fajta+" "+iz;
    }
    
    
}
