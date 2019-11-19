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
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Befizetes> op = new ArrayList<>();

        while (sc.hasNextLine()) {
            
            String[] s = sc.nextLine().split(";");
            Befizetes b = new Befizetes(s[0], Integer.parseInt(s[1]));

            if (op.contains(b)) {
                int idx = op.indexOf(b);
                op.get(idx).setOsszeg(op.get(idx).getOsszeg() + Integer.parseInt(s[1]));
            } else {
                op.add(b);
            }

        }

        Collections.sort(op);
        for (Befizetes i : op) {
            System.out.println(i);
        }
    }
}
