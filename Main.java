/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Main {
    public static Aszu[] puttony(Bor[] b){
        Aszu[] a;
        Aszu[] aszult;
        Aszu aszu=null;
        int szamol=0;
        int szamol2=0;
        for(int i=0;i<b.length;i++){
            if(b[i] instanceof Aszu)
                szamol++;
        }
        int index=0;
        a= new Aszu[szamol];
        for(int i=0;i<b.length;i++){
            if(b[i] instanceof Aszu){
                aszu= (Aszu) b[i];
                a[index]=aszu;
                index++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i].hanyPuttonyos()==5)
                szamol2++;
        }
        index=0;
        aszult= new Aszu[szamol2];
        for(int i=0;i<a.length;i++){
            if(a[i].hanyPuttonyos()==5){
                
                aszult[index]=a[i];
                index++;
            }
        }
        
        return aszult;
        
    }
    
    public static void main(String[] args) {
        Bor [] b= new Bor[]{
        new Bor("fehér","Tokaj","édes",8),
        new Bor("fehér","Badacsony","száraz",5),
        new Bor("vörös","Eger","édes",7),
        new Bor("fehér","Tokaj","édes",8),
        new Aszu(5,"kéknyelvű", "Tokaj", "édes", 5),
        new Aszu(6,"kéknyelvű", "Tokaj", "édes", 6),
        new Aszu(7,"kéknyelvű", "Tokaj", "édes", 7)
    };
        
       Aszu[] aszu= puttony(b);
        for (Aszu aszu1 : aszu) {
            System.out.println(aszu1);
        }
        
    }
    
    
}
