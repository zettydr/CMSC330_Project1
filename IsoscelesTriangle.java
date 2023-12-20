package Project1;
import java.awt.*;
// CMSC 330 Advanced Programming Languages
// IsoscelesTriangle.java
// Diamond Zetty
// 11/14/2023
public class IsoscelesTriangle extends Image {
    private Color triangleColor;
    private Point topVertex;
    private int height;
    private int baseWidth;

    public IsoscelesTriangle(Color triangleColor, Point topVertex,int height,int baseWidth){
        super(triangleColor);
        this.triangleColor = triangleColor;
        this.topVertex = topVertex;
        this.height = height;
        this.baseWidth = baseWidth;

    }

    @Override
    public void draw(Graphics g) {
        int[] xPoints = {topVertex.x, topVertex.x - baseWidth/2, topVertex.x + baseWidth/2};
        int[] yPoints = {topVertex.y, topVertex.y + height, topVertex.y + height};

        g.setColor(triangleColor);
        g.fillPolygon(xPoints,yPoints,3);
    }
}

