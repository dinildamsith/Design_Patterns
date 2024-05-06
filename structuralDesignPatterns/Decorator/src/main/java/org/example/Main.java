package org.example;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("CIRCLE : normal border");
        circle.draw();
        System.out.println("CIRCLE : Red border");
        redCircle.draw();
        System.out.println("RECTANGLE : Red border");
        redRectangle.draw();

    }
}