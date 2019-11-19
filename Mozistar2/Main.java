/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mozistar2;

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
        List<Szinesz> szl = new ArrayList();

        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        
        
        while (sor.length() > 0) {
            
            String[] st = sor.split("[():,]");
            
            for (int i = 3; i < st.length; i++) {
                Szinesz sz = new Szinesz(st[i]);

                if (szl.contains(sz)) {
                    szl.get(szl.indexOf(sz)).getFilm().add(new Film(st[0], Integer.parseInt(st[1])));
                } else {
                    sz.getFilm().add(new Film(st[0], Integer.parseInt(st[1])));
                    szl.add(sz);
                }

            }

            sor = sc.nextLine();

        }

        
        Collections.sort(szl);
        for(Szinesz i:szl)
            System.out.println(i);
    }
}
