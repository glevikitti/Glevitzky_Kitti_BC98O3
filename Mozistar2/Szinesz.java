/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mozistar2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Dell
 */
public class Szinesz implements Comparable<Szinesz>{
    private String sznev;
    private List<Film> film;

    public Szinesz(String sznev) {
        this.sznev = sznev;
        this.film = new ArrayList<>();
    }

    public String getSznev() {
        return sznev;
    }

    public void setSznev(String sznev) {
        this.sznev = sznev;
    }

    public List<Film> getFilm() {
        return film;
    }

    public void setFilm(List<Film> film) {
        this.film = film;
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        
        sb.append(this.sznev).append("\n");
        Collections.sort(film);
        for (int i = 0; i < film.size(); i++) {
            if (i == film.size() - 1) {
                sb.append(film.get(i));
            } else {
                sb.append(film.get(i)).append("\n");
            }
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Szinesz)){
            return false;
        }
        Szinesz sz= (Szinesz) obj;
        
        return this.sznev.equals(sz.sznev);
    }
    
    

    @Override
    public int compareTo(Szinesz t) {
        if (this.film.size() == t.getFilm().size()) {
            return this.sznev.compareTo(t.getSznev());
        } else {
            return (-1) * Integer.compare(this.film.size(), t.getFilm().size());
        }
    }
    
    
}
