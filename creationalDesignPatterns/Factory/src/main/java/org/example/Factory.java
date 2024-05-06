package org.example;

public class Factory {

    public Shape getShape(String type){
        if (type.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(type.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }
}
