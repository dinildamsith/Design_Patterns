package org.example;

import java.util.Observable;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("BINARY :"+Integer.toBinaryString(subject.getState()).toUpperCase());
    }
}
