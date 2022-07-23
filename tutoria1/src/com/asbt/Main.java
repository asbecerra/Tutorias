package com.asbt;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Enter Data
        Scanner enter = new Scanner(System.in);
        //Square
        System.out.print("Enter the square length: ");
        int squareLength = enter.nextInt();
        //Rectangle
        System.out.print("Enter the rectangle lenth: ");
        int rectangleLength = enter.nextInt();
        System.out.print("Enter the rectangle width: ");
        int rectangleWidth = enter.nextInt();
        //Triangle
        System.out.print("Enter the triangle height: ");
        int triangleHeight = enter.nextInt();
        System.out.print("Enter the triangle base: ");
        int triangleBase = enter.nextInt();
        System.out.print("Enter the triangle length 1: ");
        int triangleL1 = enter.nextInt();
        System.out.print("Enter the triangle length 2: ");
        int triangleL2 = enter.nextInt();

       Square square = new Square(squareLength);
       Rectangle rectangle = new Rectangle(rectangleLength, rectangleWidth);
       Triangle triangle = new Triangle(triangleHeight, triangleBase, triangleL1, triangleL2);

    }
}
