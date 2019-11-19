/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lakohaz;

/**
 *
 * @author Dell
 */
public class Lakohaz implements Comparable<Lakohaz>{
    public static double emeletMagassag=3.2;
    private String cim;
    private int emeletekSzama;
    private double alapterulet;

    public Lakohaz(String cim, int emeletekSzama, double alapterulet) {
        this.cim = cim;
        this.emeletekSzama = emeletekSzama;
        this.alapterulet = alapterulet;
    }

    public String getCim() {
        return cim;
    }

    public int getEmeletekSzama() {
        return emeletekSzama;
    }

    public double getAlapterulet() {
        return alapterulet;
    }
    
    public double legkobmeter(){
        return alapterulet*emeletekSzama*emeletMagassag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.cim).append(":\n");
        sb.append(legkobmeter());
        
        return sb.toString();
    }

    

   
    
    
    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Lakohaz))
            return false;
        
            Lakohaz l = (Lakohaz) obj;
            
            return this.cim.equals(l.getCim());
        
    }

    @Override
    public int compareTo(Lakohaz t) {
        return Double.compare(this.legkobmeter(), t.legkobmeter());
    }
    
    
}
