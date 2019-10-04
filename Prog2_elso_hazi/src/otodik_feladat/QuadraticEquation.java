/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otodik_feladat;

/**
 *
 * @author Dell
 */


    public class QuadraticEquation {

        public double a;
        public double b;
        public double c;

        public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getA() {
            return a;
        }

        public double getB() {
            return b;
        }

        public double getC() {
            return c;
        }

        public double getDiscriminant() {
            return this.b * this.b - 4 * this.a * this.c;
        }

        public double getRoot1() {
            if (getDiscriminant() > 0) {
                return (-1 * this.b + Math.sqrt(this.b * this.b - 4 * this.a * this.c)) / 2 * this.a;
            }
            return 0;
        }

        public double getRoot2() {
            if (getDiscriminant() > 0) {
                return (-1 * this.b - Math.sqrt(this.b * this.b - 4 * this.a * this.c)) / 2 * this.a;
            }
            return 0;
        }

        @Override
        public String toString() {
            return "QuadraticEquation{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
        }
    }

