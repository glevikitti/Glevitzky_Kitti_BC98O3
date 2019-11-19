/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rendezheto;

/**
 *
 * @author Dell
 */
public class Tea implements Rendezheto<Tea> {
    public String nev;
public int ár;
public Tea(String s,int j) {
    nev=s;
    ár=j;
}

    @Override
    public boolean egyenlo(Object o) {
        Tea t= (Tea) o;
        return this.ár==t.ár;
    }

    @Override
    public boolean nagyobbMint(Object o) {
        Tea t= (Tea) o;
        return this.ár>t.ár;
    }

    @Override
    public boolean kisebbMint(Object o) {
        Tea t= (Tea) o;
        return this.ár<t.ár;
    }
}
