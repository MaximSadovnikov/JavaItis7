package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,4);
        Square square = new Square(5);
        Ellipse ellipse = new Ellipse(3,4);
        Circle circle = new Circle(1);

        Shape shapes[] = new Shape[4];
        shapes[0] = rectangle;
        shapes[1] = square;
        shapes[2] = ellipse;
        shapes[3] =circle;

        for(int i = 0 ; i < 4 ; i++){
            System.out.println(shapes[i].calcArea());
            System.out.println(shapes[i].calcPerimetr());

        }
    }
}
