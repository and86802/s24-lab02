package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Renderer implements Shape{
    Shape shape;
    
    Renderer(Shape shape) {
        this.shape = shape;
    }

    public double getArea(){
        return this.shape.getArea();
    }

    void draw() {
        System.out.println("Shape printed\n" + "Its area is " + getArea());
    }
}
