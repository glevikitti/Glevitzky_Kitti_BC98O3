/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mozistar2;

/**
 *
 * @author Dell
 */
public class Film implements Comparable<Film>{
    private String cim;
    private int megjelenesEve;

    public Film(String cim, int megjelenesEve) {
        this.cim = cim;
        this.megjelenesEve = megjelenesEve;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public int getMegjelenesEve() {
        return megjelenesEve;
    }

    public void setMegjelenesEve(int megjelenesEve) {
        this.megjelenesEve = megjelenesEve;
    }

    @Override
    public String toString() {
        return megjelenesEve+": "+cim;
    }
    
    

    @Override
    public int compareTo(Film t) {
        if((Integer.compare(this.megjelenesEve, t.getMegjelenesEve()))==0){
            return this.cim.compareTo(t.getCim());
        }
        return Integer.compare(this.megjelenesEve, t.getMegjelenesEve());
    }
    
    
}
