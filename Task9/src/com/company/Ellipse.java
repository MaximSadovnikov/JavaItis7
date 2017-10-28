package com.company;

public class Ellipse extends Shape {
        protected double a;
        protected double b;

        public Ellipse(double a,double b){
            this.a = a;
            this.b = b;
        }


        public double calcArea() {
            return Math.PI * this.a * this.b;
        }

        public double calcPerimetr() {
            return 2 * Math.PI * Math.sqrt((this.a * this.a + this.b * this.b)/2);
        }

}
