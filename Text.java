package Project1;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
// CMSC 330 Advanced Programming Languages
// IsoscelesTriangle.java
// Diamond Zetty
// 11/14/2023
public class Text extends Image{
    private Color textColor;
    private Point location;
    private String text;

    public Text(Color textColor, Point location, String text){
        super(textColor);
        this.textColor = textColor;
        this.location = location;
        this.text = text;

    }

    @Override
    public void draw(Graphics g) {
        g.setColor(textColor);
        g.drawString(text, location.x, location.y);
    }
}
