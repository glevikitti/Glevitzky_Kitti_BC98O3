/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Egyetem;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean b = false;
        
        int sorokszama=Integer.parseInt(sc.nextLine());
        
        Hallgato[] h= new Hallgato[sorokszama];
        
        for (int i = 0; i < h.length; i++) {
            String[] s= sc.nextLine().split(",");
            
            
            if(s[1].equals("igaz")){
                b=true;
            }
            else if(s[1].equals("hamis")){
                b=false;
            }
            
            
                
            
            h[i]= new Hallgato(Integer.parseInt(s[0]),b);
            
            
            
        }
        
        for (Hallgato hallgato : h) {
            System.out.println(hallgato);
        }
//for (int i = 0; i < h.length; i++) {
//           System.out.println(h);
//}   
        
    }
}
