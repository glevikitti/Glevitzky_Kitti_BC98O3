/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masodik_feladat;

/**
 *
 * @author Dell
 */
public class RegularPolygon {
    public int n;
    public double side;
    public double x;
    public double y;

    public RegularPolygon() {
        
        this.n=3;
        this.side=1;
        this.x=0;
        this.y=0;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }
    
    

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double getPerimeter()
    {
        return this.n*this.side;
    }
    
    public double getArea()
    {
        return 0.25*this.n*this.side*this.side*(1/Math.tan(Math.PI/this.n)); 
    }

    @Override
    public String toString() {
        return "Az sokszögem oldalainak száma:"+n+" A sokszögem 1 oldalának hossza:"+side+" A területe:"+getArea()+" A kerülete:"+getPerimeter();
    }
    
    
    
    
    
}
