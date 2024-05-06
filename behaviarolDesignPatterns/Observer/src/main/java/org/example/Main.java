package org.example;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new HexaObSever(subject);

        System.out.println("State Value : 10");
        subject.setState(10);
        System.out.println("State Value : 5");
        subject.setState(5);
    }
}