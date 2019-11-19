/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Karacsony;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        List<Hozzavalok> li= new ArrayList<>();
        
        while(sc.hasNextLine()){
            String[] s=sc.nextLine().split(";");
            
            Hozzavalok h= new Hozzavalok(s[0],Integer.parseInt(s[1]));
            
            if(li.contains(h)){
                int idx=li.indexOf(h);
                li.get(idx).setMennyiseg(li.get(idx).getMennyiseg()+Integer.parseInt(s[1]));
            }
            else{
                li.add(h);
            }
        }
        
        Collections.sort(li);
        
        for(Hozzavalok i:li){
            System.out.println(i);
        }
    }
}

class Hozzavalok implements Comparable<Hozzavalok>{
    private String nev;
    private int mennyiseg;

    public Hozzavalok(String nev, int mennyiseg) {
        this.nev = nev;
        this.mennyiseg = mennyiseg;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    @Override
    public String toString() {
        return this.nev+";"+this.mennyiseg;
    }

    @Override
    public int compareTo(Hozzavalok o) {
        if(this.mennyiseg==o.getMennyiseg())
            return this.nev.compareTo(o.getNev());
        else 
            return (-1)*Integer.compare(this.mennyiseg,o.getMennyiseg()); //Azért kell -1 mert csökkenő az elvárt sorrend a feladatban az alap a növekvősorrend
        //Ha valós akkor a Double.compare kell!
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Hozzavalok))
            return false;
        
        
        Hozzavalok h=(Hozzavalok) obj;
        
        return this.nev.equals(h.getNev());
    }

}
