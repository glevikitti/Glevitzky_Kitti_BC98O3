/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ital;

import java.util.Arrays;

/**
 *
 * @author Dell
 */
public class Main {
    public static void main(String[] args) {
        Ital[] ital= new Ital[]{
            new Ital("Narancslé","1",150),
            new Ital("Ásványvíz","2",100),
            new Ital("Limonádé","1.5",250),
            new SzeszesItal("Barna sör","0.5",200,5),
            new SzeszesItal("Vörös bor","1",600,12),
            new SzeszesItal("Szilva pálinka","0.2",1000,40)
        };
        Arrays.sort(ital);
        SzeszesItal [] t=Dolgozat.szeszes(ital);
        for (SzeszesItal a : t) {
            System.out.println(a);    
        }
    }
}
