/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoki;

/**
 *
 * @author Dell
 */
public class Meccs {
    private String jatekosA;
    private String jatekosB;
    private String[] eredmenyek;
    private boolean harom;
    private int Agol;
    private int Bgol;

    public String getJatekosA() {
        return jatekosA;
    }

    public String getJatekosB() {
        return jatekosB;
    }

    public String[] getEredmenyek() {
        return eredmenyek;
    }

    public boolean isHarom() {
        return harom;
    }

    public int getAgol() {
        return Agol;
    }

    public int getBgol() {
        return Bgol;
    }

    public Meccs(String jatekosA, String jatekosB, String[] eredmenyek) {
        this.jatekosA = jatekosA;
        this.jatekosB = jatekosB;
        this.eredmenyek = eredmenyek;
    }
    
    
}
