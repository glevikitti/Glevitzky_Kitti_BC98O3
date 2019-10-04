/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negyedik_feladat;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Dell
 */
public class Ital {
    
    protected String név;
    protected String kiszerelés;
    private static int ár;
    protected Date gyártásiDátum;

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public void setKiszerelés(String kiszerelés) {
        this.kiszerelés = kiszerelés;
    }

    public static int getÁr() {
        return ár;
    }

    public static void setÁr(int ár) {
        Ital.ár = ár;
    }

    public Date getGyártásiDátum() {
        return gyártásiDátum;
    }

    public void setGyártásiDátum(Date gyártásiDátum) {
        this.gyártásiDátum = gyártásiDátum;
    }

    @Override
    public String toString() {
        return név+", "+kiszerelés+", "+ár+"Ft";
    }
    
    public static double getÁrEuróban()
    {
        return ár/330;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null||!(obj instanceof Ital))
            return false;
        
        Ital masik=(Ital) obj;
        if(this.név.equals(masik.név)&&this.kiszerelés.equals(masik.kiszerelés))
            return true;
        else return false;
    }
    
    
    
}
