package org.example;

public abstract class ShapDecorator implements Shape {
    // can be inherit to sub class
    protected Shape decoratorShape;

    // Constructor
    public ShapDecorator(Shape decoratorShape){
        this.decoratorShape = decoratorShape;
    }

    // override method
    public void draw(){
        decoratorShape.draw();
    }
}
