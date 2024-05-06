package org.example;

public class ShapMaker {
    private Circle circle;
    private Rectangle rectangle;

    public ShapMaker(){
        circle= new Circle();
        rectangle = new Rectangle();
    }

    public void DrawCircle(){
        circle.draw();
    }
    public void DrawRectangle(){
        rectangle.draw();
    }
}
