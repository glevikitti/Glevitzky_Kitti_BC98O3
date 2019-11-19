/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parkolo;

/**
 *
 * @author Dell
 */
public class Parkolo implements Comparable<Parkolo>{
    private String cim;
    private int terulet;
    private int kapacitas;
    private int rendszam;

    public Parkolo(String cim, int terulet, int kapacitas, int rendszam) {
        this.cim = cim;
        this.terulet = terulet;
        this.kapacitas = kapacitas;
        this.rendszam = rendszam;
    }

    

    public String getCim() {
        return cim;
    }

    public int getTerulet() {
        return terulet;
    }

    public int getKapacitas() {
        return kapacitas;
    }

    public int getRendszam() {
        return rendszam;
    }
    
    public int getSzabadhely(){
        return kapacitas-rendszam;
    }

    @Override
    public String toString() {
        return cim+": "+getSzabadhely()+" szabad hely";
    }

    @Override
    public int compareTo(Parkolo t) {
       if((Integer.compare(this.getSzabadhely(), t.getSzabadhely()))==0){
           return this.cim.compareTo(t.cim);
       }
       else return (-1)*Integer.compare(this.getSzabadhely(), t.getSzabadhely());
    }
    
    
}
