/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Bor extends AlkoholosItal{
    private String szolofajta;
    private String termoTerulet;

    public Bor(String szolofajta, String termoTerulet, String iz, double alkoholTartalom) {
        super(iz, alkoholTartalom);
        this.szolofajta = szolofajta;
        this.termoTerulet = termoTerulet;
    }

   public String milyenSzolobolKeszult(){
       return szolofajta;
   }
   
   public String mibolKeszult(){
       return szolofajta;
   }
   
   public String holTermett(){
       return termoTerulet;
   }

    @Override
    public String milyenIzu() {
        return getIz();
    }

    @Override
    public String toString() {
        return szolofajta+" "+termoTerulet;
    }
    
    

   
}
