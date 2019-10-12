/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negyedik_feladat;

/**
 *
 * @author Dell
 */
public class Teherauto extends Auto{
    
    private int MaxSzallithatoTeher;

    public Teherauto(int MaxSzallithatoTeher, String rendszam, int motorTeljesitmeny) {
        super(rendszam, motorTeljesitmeny);
        this.MaxSzallithatoTeher = MaxSzallithatoTeher;
    }

    public int getMaxSzallithatoTeher() {
        return MaxSzallithatoTeher;
    }

    @Override
    public String toString() {
        return "Teherauto{" + "MaxSzallithatoTeher=" + MaxSzallithatoTeher + '}' +" "+getRendszam();
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Auto)) {
            return false;
        }
        Teherauto masik = (Teherauto) obj;
        if (this.MaxSzallithatoTeher==masik.MaxSzallithatoTeher) {
            return true;
        }
        return false;
    }
    
}
