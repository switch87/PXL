package PellinGert.PXL.essentials.figurentekenen.shapes;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by gert on 4/04/2015.
 */
public class Logo implements Drawable {
    private ArrayList<Circle> circles;
    private ArrayList<Rectangle> rectangles;
    private String text;

    public Logo(ArrayList<Circle> Circles, ArrayList<Rectangle> Rectangles, String Text) {
        setCircle(Circles);
        setRectangle(Rectangles);
        setText(Text);
    }

    public ArrayList<Circle> getCircle() {
        return circles;
    }

    public void setCircle(ArrayList<Circle> circles) {
        circles = circles;
    }

    public ArrayList<Rectangle> getRectangle() {
        return rectangles;
    }

    public void setRectangle(ArrayList<Rectangle> rectangles) {
        rectangles = rectangles;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        text = text;
    }

    public double getArea() {
        double Area = 0;
        for (Circle circle : circles) Area += circle.getArea();
        for (Rectangle rectangle : rectangles) Area += rectangle.getArea();
        return Area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Logo)) return false;

        Logo logo = (Logo) o;

        if (!circles.equals(logo.circles)) return false;
        if (!rectangles.equals(logo.rectangles)) return false;
        return getText().equals(logo.getText());

    }

    @Override
    public int hashCode() {
        int result = circles.hashCode();
        result = 31 * result + rectangles.hashCode();
        result = 31 * result + getText().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Logo{" +
                "Circles=" + circles.size() +
                ", Rectangles=" + rectangles.size() +
                ", Text='" + text + '\'' +
                '}';
    }

    @Override
    public void Draw(Graphics g) {

    }

    @Override
    public void scale(int factor) {
        for (Circle circle : circles) {
            circle.scale(factor);
        }
        for (Rectangle rectangle : rectangles) {
            rectangle.scale(factor);
        }
    }
}
