/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elso_feladat;

import java.util.Date;

/**
 *
 * @author Dell
 */
public class Circle extends GeometricShape {
    private double radius;

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
       
    }

    public Circle(double radius) {
        this.radius = radius;
         this.dateCreated= new Date();
    }

    

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea()
    {
        return this.radius*this.radius*Math.PI;
    }
    
    public double getPerimeter()
    {
        return 2*this.radius*Math.PI;
    }
    
    public double getDiameter()
    {
        return 2*this.radius;
    }
    
}
