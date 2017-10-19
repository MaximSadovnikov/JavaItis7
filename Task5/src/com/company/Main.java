package com.company;

import java.util.Scanner;

public class Main {

    public static double integrateSin2x(double a, double b, int n) {
        double h = Math.abs(b - a) / (2 * n) ;
        double result = (Math.sin(2 * a) + Math.sin(2*(a + h * 2 * n))) * h / 3;;
        for(int i = 1; i <= (2 * n) - 1 ; i++) {
            if (i%2 == 1) {
                result = result + 4 * Math.sin(2*(a + h*i)) * h / 3;;
            }
            else
            {
                result = result + 2 * Math.sin(2*(a + h*i)) * h / 3;;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b;
        int n;

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        n = scanner.nextInt();

        double result = integrateSin2x(a, b, n);
        System.out.println(result);
    }
}
