package org.example;

public class Main {
    public static void main(String[] args) {
       Context context = new Context(new OperationMultiplication());
        System.out.println(context.executeStrategery(20,10));

        Context context1 = new Context(new OperationSubtract());
        System.out.println(context1.executeStrategery(20,10));
    }
}