package org.example;

public class Main {
    public static void main(String[] args) {

        Factory factory = new Factory();
        Shape circle = factory.getShape("CIRCLE");
        circle.draw();
    }
}