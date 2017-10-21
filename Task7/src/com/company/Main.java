package com.company;


import com.sun.org.apache.regexp.internal.RE;

public class Main {

    public static void main(String[] args) {
        Rectangle a = new Rectangle(2,4);
        Rectangle b = new Rectangle(2,3);
        Rectangle c = new Rectangle(3,1);
        Rectangle d = new Rectangle(4,1);
        Rectangle e = new Rectangle(1,1);
        Rectangle m = null;

        Rectangle rectangles[] = {a, b, c, d, e};
        for (int i = 0; i < 4; i++){
            int sort = rectangles[i].area;
            int pow = 0 ;
            m = rectangles[i];
            for (int j = i+1 ; j < 5 ; j++) {
                if (rectangles[j].area < sort) {
                    sort = rectangles[j].area;
                    m = rectangles[j];
                    pow = j;
                } else {
                    pow=i;
                }
                rectangles[pow] = rectangles[i];
                rectangles[i] = m ;
            }
            for (int j = 0 ; j < 5 ; j++) {
                System.out.println("rectangle ( " + rectangles[j].high + ", " + rectangles[j].loNG + " ) Area = " + rectangles[j].area) ;
            }
        }
    }
}


