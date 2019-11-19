/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//        List<String> tarolo=new ArrayList<>();
//        int szamolo=0;
//        String sor = new String();
//        while(sc.hasNextLine()){
//            
//            sor=sc.nextLine();
//            if(sor.equals("vege")){
//                break;
//            }
//            //String[] meccs=sor.split(":");
//            for (int i = 0; i < tarolo.size(); i++) {
//                
//                tarolo.add(i, sor);
//                System.out.println(tarolo.get(i));
//            }
//            
//            
//        
//        }

package Hoki;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> sor = new ArrayList<>(); 
        
        while(sc.hasNextLine()){
            if(sc.nextLine().equals("vege"))
                break;
            
            else sor.add(sc.nextLine());
            System.out.println(sor);
        }
        
        for (String string : sor) {
            System.out.println(string);
        }
    }
}