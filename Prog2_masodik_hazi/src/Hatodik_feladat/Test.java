/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hatodik_feladat;

/**
 *
 * @author Dell
 */
public class Test {
    public static boolean isConsecutiveFour(int[] values)
    {
        if(values.length>3){
            for(int i=0;i<values.length-3;i++)
                if(values[i]==values[i+1] && values[i+1]==values[i+2] && values[i+2]==values[i+3])
                    return true;}
        return false;
        
    }
    
    public static void main(String[] args) {
        int[] szamtomb= new int[]
        {
            10,20,30,30,30,30,40
        };
        
        System.out.println(isConsecutiveFour(szamtomb));
    }
    
}
