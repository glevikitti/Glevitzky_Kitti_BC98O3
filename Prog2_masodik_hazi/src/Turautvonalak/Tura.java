/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Turautvonalak;

/**
 *
 * @author Dell
 */
public class Tura {
    String nev;
    int kek;
    int helyi;

    public Tura(String nev, String utvonal) {
        this.nev = nev;
        char[] ut = utvonal.toCharArray();
        this.kek = 0;
        this.helyi = 0;
        for (int i = 0; i < ut.length; i++) {
            switch (ut[i]) {
                case 'K':
                    this.kek++;
                    break;
                case 'P':
                case 'S':
                case 'Z':
                    this.helyi++;
                    break;
            }
        }
    }

    @Override
    public String toString() {
        return nev;
    }
}
