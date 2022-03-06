package com.berentez;

import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("width: ");
        double width = scanner.nextDouble();
        System.out.print("length: ");
        double length = scanner.nextDouble();
        System.out.print("height: ");
        double height = scanner.nextDouble();

        int surface = (int)(2 * (width * length + width * height + length * height));
        int volume =  (int)(width * length * height);

        System.out.println("Surface Area: "+ surface);
        System.out.println("Volume: "+ volume);
    }
}
