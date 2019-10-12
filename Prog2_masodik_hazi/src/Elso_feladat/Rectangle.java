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
public class Rectangle extends GeometricShape {
    
    private double width;
    private double height;

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.dateCreated= new Date();
    }

    public Rectangle() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getArea()
    {
        return width*height;
    }
    
    public double getPerimeter()
    {
        return 2*(width+height);
    }
    
    
    
}
