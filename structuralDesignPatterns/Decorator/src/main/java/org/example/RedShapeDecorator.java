package org.example;

public class RedShapeDecorator extends ShapDecorator{
    // calling most supper class constructor
    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    public void draw(){
        decoratorShape.draw();
        setRedBorder(decoratorShape);
    }

    private void setRedBorder(Shape decoratorShape){
        System.out.println("Border Colour : RED");
    }
}
