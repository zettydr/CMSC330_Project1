package Project1;

import java.awt.*;
// CMSC 330 Advanced Programming Languages
// IsoscelesTriangle.java
// Diamond Zetty
// 11/14/2023

public class Parallelogram extends SolidPolygon {
    public Parallelogram(Color color, Point upperLeft, Point lowerRight, int offset) {
        super(color, 4);
        int[] xPoints = { upperLeft.x, lowerRight.x + offset, lowerRight.x, upperLeft.x - offset, };
        int[] yPoints = { upperLeft.y, upperLeft.y, lowerRight.y, lowerRight.y, };
        createPolygon(xPoints, yPoints);
    }
}
