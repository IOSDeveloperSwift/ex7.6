package com.Doloscan;

public class Main {

    public static void main(String[] args) {


        Shape shape = new Shape();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        circle.radius = 2.5;

        rectangle.length = 5;
        rectangle.width = 3;

        circle.calculateArea();

        rectangle.calculatePerimeter();
        rectangle.calculateArea();

    }
}
