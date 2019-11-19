/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jarmu;

import java.util.List;

/**
 *
 * @author Dell
 */
public class Teherauto extends Auto {
    
    private int TeherBiras;

    public Teherauto(int TeherBiras, String rendszám, int teljesítmény, boolean automata, List<String> extra) {
        super(rendszám, teljesítmény, automata, extra);
        this.TeherBiras = TeherBiras;
    }

    

    public int getTeherBiras() {
        return TeherBiras;
    }
    
    
}
