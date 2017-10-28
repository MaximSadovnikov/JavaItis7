package com.company;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }


    public double calcArea() {
        return this.width * this.length;
    }

    public double calcPerimetr() {
        return (this.width + this.length);
    }
}




