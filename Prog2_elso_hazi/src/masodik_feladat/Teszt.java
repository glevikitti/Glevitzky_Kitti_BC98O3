/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masodik_feladat;

/**
 *
 * @author Dell
 */
public class Teszt {
    
    public static void main(String[] args) {
        RegularPolygon rp=new RegularPolygon();
        RegularPolygon rp1=new RegularPolygon(6,4);
        RegularPolygon rp2=new RegularPolygon(10,4,5.6,7.8);
        
        System.out.println(rp);
        System.out.println(rp1);
        System.out.println(rp2);
        
    }
    
}
