package org.example;

import java.util.Locale;

public class HexaObSever extends Observer{

    public HexaObSever(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("HEX :"+ Integer.toBinaryString(subject.getState()).toUpperCase());
    }
}
