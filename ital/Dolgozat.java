/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ital;

/**
 *
 * @author Dell
 */
public class Dolgozat extends SzeszesItal{
    
    public Dolgozat(String név, String kiszerelés, int ár, int alkoholtartalom) {
        super(név, kiszerelés, ár, alkoholtartalom);
    }
    
    public static SzeszesItal[] szeszes(Ital[] t){
        SzeszesItal [] szeszes= new SzeszesItal[3];
        SzeszesItal [] osszeszes;
        int szamolo=0;
        int index=0;
        
        for(int i=0;i<t.length;i++){
            
            if(t[i] instanceof SzeszesItal){
                
                szamolo++;
            }
        }
        osszeszes=new SzeszesItal[szamolo];
        for(int i=0;i<t.length;i++) {
            if(t[i] instanceof SzeszesItal) {
                SzeszesItal szi=(SzeszesItal) t[i];
                  osszeszes[index]=szi;
                  index++;
            }
        }
        for(int i=0;i<osszeszes.length-1;i++)
            for(int j=i+1;j<osszeszes.length;j++){
                if(osszeszes[i].getAlkoholTartalom()<osszeszes[j].getAlkoholTartalom()){
                    SzeszesItal szi=osszeszes[i];
                    osszeszes[i]=osszeszes[j];
                    osszeszes[j]=szi;
                }
            }
        if(osszeszes.length<3){
            return null;
        }
        else {
        szeszes[0]=osszeszes[0];
        szeszes[1]=osszeszes[1];
        szeszes[2]=osszeszes[2];
        }
        
    return szeszes;
}

}
