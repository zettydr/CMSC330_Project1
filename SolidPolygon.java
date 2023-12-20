package Project1;
import java.awt.*;
// CMSC 330 Advanced Programming Languages
// IsoscelesTriangle.java
// Diamond Zetty
// 11/14/2023

public class SolidPolygon extends Polygon_ {

    public SolidPolygon(Color color, int vertexCount) {
        super(color, vertexCount);
    }

    @Override
    public void drawPolygon(Graphics g, Polygon p) {
        g.drawPolygon(p);
        g.fillPolygon(p);
    }
}
