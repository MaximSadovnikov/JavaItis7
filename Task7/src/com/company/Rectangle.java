package com.company;

public class Rectangle {
    int loNG;
    int high;
    int area;

    public Rectangle(int a, int b){
        this.loNG = a;
        this.high = b;
        this.area = Area(loNG, high);

    }
    int Area(int l, int d) {
        int result = l * d ;
        return result;
        }
    }

