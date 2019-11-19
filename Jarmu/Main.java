/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jarmu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Main {
    public static List<Auto> teljesitmeny(List<Auto> auto){
        List<Auto> rendezett= new ArrayList<>();
                
        if(auto.size()<3){
            return auto;
        }
        else {
           Collections.sort(auto);
           rendezett.set(0, auto.get(0));
           rendezett.set(1, auto.get(1));
           rendezett.set(2, auto.get(2));
           
        }
       
        
        return rendezett;
    }
    
    public static boolean helyes(String rendszam){
        if(rendszam.length()!=6)
            return false;
        
        
        for(int i=0;i<rendszam.length()-3;i++){
            if(!(Character.isAlphabetic(rendszam.charAt(i))))
                return false;
        }
        
        for(int i=3;i<rendszam.length();i++){
            if(!(Character.isDigit(rendszam.charAt(i))))
                return false;
        }
        
        return true;
    }
    
    public static List<Teherauto> teherbiro(Auto[] a){
        Teherauto t;
       List<Teherauto> li= new ArrayList<>();
       List<Teherauto> li2= new ArrayList<>();
       
        
        int szamol=0;
        for(int i=0;i<a.length;i++){
            if(a[i] instanceof Teherauto){
                t= (Teherauto) a[i];
                li.add(t); 
            }
        }
        for(int i=0;i<li.size();i++){
            if(li.get(i).getTeherBiras()>20){
                li2.add(li.get(i));
            }
                
        }
       return li2;
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Auto a;
        String rendszam=sc.nextLine();
        a= new Auto(rendszam,100,true,null);
        System.out.println(a);
        
        Auto[] au= new Auto[4];
        for(int i=0;i<au.length;i++){
            String[] s= sc.nextLine().split(" ");
            au[i]= new Auto(s[0],Integer.parseInt(s[1]),Boolean.parseBoolean(s[2]),null);
        }
        
    }
}
