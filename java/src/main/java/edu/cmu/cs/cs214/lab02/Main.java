package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 10);
        
        Renderer renderer = new Renderer(rectangle);
        
        renderer.draw();

        // Shape circle = new Circle(3);
        // Renderer renderer_cir = new Renderer(circle);
        // renderer_cir.draw();
        
    }
}
