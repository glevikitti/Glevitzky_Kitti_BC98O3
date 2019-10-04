/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harmadik_feladat;

/**
 *
 * @author Dell
 */
public class RectAngle {
    
    public double width;
    public double height;

    public RectAngle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public RectAngle() {
        this.height=1.0;
        this.width=1.0;
    }
    
    
    public double getPerimeter()
    {
       return 2*(this.height+this.width);
    }
    
    public double getArea()
    {
        return this.height*this.width;
    }

    @Override
    public String toString() {
        return "A téglalapom egyik oldala: "+height+"A másik oldala: "+width+"A területe: "+getArea()+"A kerülete: "+getPerimeter();
    }
    
    
}
