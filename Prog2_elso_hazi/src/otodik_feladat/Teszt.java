/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otodik_feladat;

/**
 *
 * @author Dell
 */
public class Teszt {
    public static void main(String[] args) {
        QuadraticEquation qe= new QuadraticEquation(2, 3, 4);
        QuadraticEquation qe1= new QuadraticEquation(-1, 3, 4);
        QuadraticEquation qe2= new QuadraticEquation(2, -3, 4);
        
        if(qe.getDiscriminant()>0)
            System.out.println(qe+" "+qe.getRoot1()+" "+qe.getRoot2());
        else if(qe.getDiscriminant()==0)
            System.out.println(qe+" "+qe.getRoot1());
        else System.out.println("The equation has no roots.");
        
        if(qe1.getDiscriminant()>0)
            System.out.println(qe1+" "+qe1.getRoot1()+" "+qe1.getRoot2());
        else if(qe1.getDiscriminant()==0)
            System.out.println(qe1+" "+qe1.getRoot1());
        else System.out.println("The equation has no roots.");
        
        if(qe2.getDiscriminant()>0)
            System.out.println(qe2+" "+qe2.getRoot1()+" "+qe2.getRoot2());
        else if(qe2.getDiscriminant()==0)
            System.out.println(qe2+" "+qe2.getRoot1());
        else System.out.println("The equation has no roots.");
        
    }
}
