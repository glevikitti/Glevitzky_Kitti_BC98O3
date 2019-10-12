/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Szotar2;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Test {
    public static Szotar szavak[];
    
    public static void rendez(Szotar [] sz){
        
        for(int i=0; i<sz.length-1; ++i){
            
            for(int j=i+1; j<sz.length; ++j){
                
                if(sz[i].getAngol().compareTo(sz[j].getAngol())==0){
                    
                    if(sz[i].getMagyar().compareTo(sz[j].getMagyar())>0){
                        
                        Szotar tmp=sz[i];
                        sz[i]=sz[j];
                        sz[j]=tmp;
                    }
                }
                
                else if(sz[i].getAngol().compareTo(sz[j].getAngol())>0){
                    
                    Szotar tmp=sz[i];
                    sz[i]=sz[j];
                    sz[j]=tmp;
                }
            }
            
        }
        
    }
    
    
    
    public static void kiir(Szotar [] sz){
        for(int i=0; i<sz.length; ++i) {
            System.out.println(sz[i]);
        }
       
    }
    
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=Integer.parseInt(sc.nextLine());
        
        szavak=new Szotar[n];
        
        for(int i=0; i<n; ++i){
            String sor=sc.nextLine();
            String st[]=sor.split(":");
            
            szavak[i]=new Szotar(st[0],st[1]);
            
        }
        rendez(szavak);
        kiir(szavak);
    }

}
