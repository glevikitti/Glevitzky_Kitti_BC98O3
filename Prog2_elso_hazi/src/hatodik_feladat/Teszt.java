/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hatodik_feladat;

/**
 *
 * @author Dell
 */
public class Teszt {
    public static void main(String[] args) {
        LinearEquation le= new LinearEquation(1,2,3,4,5,6);
        LinearEquation le1= new LinearEquation(12,7,5,9,15,8);
        LinearEquation le2= new LinearEquation(11,12,7,10,4,6);
        
        if(le.isSolvable()==true)
            System.out.println(le.getX()+" "+le.getY());
        else System.out.println("The Equation has no solution");
        
        if(le.isSolvable()==true)
            System.out.println(le1.getX()+" "+le1.getY());
        else System.out.println("The Equation has no solution");
        
        if(le.isSolvable()==true)
            System.out.println(le2.getX()+" "+le2.getY());
        else System.out.println("The Equation has no solution");
        
    }
    
}
