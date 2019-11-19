/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Osztalypenz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
class Befizetes implements Comparable<Befizetes> {

    private String nev;
    private int osszeg;

    public Befizetes(String nev, int osszeg) {
        this.nev = nev;
        this.osszeg = osszeg;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getOsszeg() {
        return osszeg;
    }

    public void setOsszeg(int osszeg) {
        this.osszeg = osszeg;
    }

    @Override
    public String toString() {
        return this.nev + ";" + this.osszeg;
    }

    @Override
    public int compareTo(Befizetes t) {
        if (this.osszeg == t.getOsszeg()) {
            return this.nev.compareTo(t.getNev());
        } else {
            return (-1) * Integer.compare(this.osszeg, t.getOsszeg());
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Befizetes)) {
            return false;
        }

        Befizetes h = (Befizetes) obj;

        return this.nev.equals(h.getNev());
    }
}

