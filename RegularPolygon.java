package Project1;

import java.awt.*;
// CMSC 330 Advanced Programming Languages
// IsoscelesTriangle.java
// Diamond Zetty
// 11/14/2023


public class RegularPolygon extends SolidPolygon {

    public RegularPolygon(Color color, int numSides, Point center, int radius) {
        super(color,numSides);
        double angle = (2 * Math.PI) / numSides; // 2pi is full circle, divide by num sides to get the angle between
        // each point
        int[] xPoints = new int[numSides + 1]; // init how many x coordinates needed
        int[] yPoints = new int[numSides + 1];// init how many y coordinates needed

        int index = 0;
        for (double currentAngle = 0; currentAngle < (2 * Math.PI); currentAngle += angle) {
            xPoints[index] = (int) (radius * Math.cos(currentAngle) + center.x);
            yPoints[index] = (int) (radius * Math.sin(currentAngle) + center.x);
            index += 1;
        }
        createPolygon(xPoints,yPoints);
    }
}

