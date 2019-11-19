/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bankartya;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Bankkartya {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        List<Integer> szamos = new ArrayList<>();
        int szam = 0;

        while (sc.hasNextLine()) {
            String sor = sc.nextLine();
            if (sor.equals("vege")) {
                break;
            }
            for (int i = 0; i < sor.length(); i++) {
                szamos.set(i, Integer.parseInt(Character.toString(sor.charAt(i))));
            }

            for (int i = 0; i < szamos.size(); i += 2) {
                szamos.set(i, szamos.get(i)*2);

            }

            for (int i = 0; i < szamos.size(); i++) {
                if (szamos.get(i) > 9) {
                    szamos.set(i,szamos.get(i) / 10 + szamos.get(i) % 10);
                } else {
                    szamos.set(i,szamos.get(i));
                }

            }

            for (int i = 0; i < szamos.size(); i++) {
                szam += szamos.get(i);

            }

           

        }
        
         if (szam % 10 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
    
    }
    
}
