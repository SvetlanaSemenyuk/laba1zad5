package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int c=0, b=0;
        double d;
        Scanner in = new Scanner (System.in);
        System.out.println("Введите длину гипотенузы с:  ");
        c = in.nextInt();
        System.out.println("Введите длину катета b:  ");
        b = in.nextInt();
        System.out.println("Катет прямоугольного треугольника равен d:  ");
        d= Math.sqrt(Math.pow(c,2)-Math.pow(b,2));
        System.out.println(d);
        d = in.nextDouble();
    }
}
