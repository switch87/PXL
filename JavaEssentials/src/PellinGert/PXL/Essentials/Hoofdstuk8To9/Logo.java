package PellinGert.PXL.Essentials.Hoofdstuk8To9;

import java.util.ArrayList;

/**
 * Created by gert on 4/04/2015.
 */
public class Logo {
    private ArrayList<Circle> Circles;
    private ArrayList<Rectangle> Rectangles;
    private String Text;

    public Logo(ArrayList<Circle> Circles, ArrayList<Rectangle> Rectangles, String Text) {
        setCircle(Circles);
        setRectangle(Rectangles);
        setText(Text);
    }

    public ArrayList<Circle> getCircle() {
        return Circles;
    }

    public void setCircle(ArrayList<Circle> circles) {
        Circles = circles;
    }

    public ArrayList<Rectangle> getRectangle() {
        return Rectangles;
    }

    public void setRectangle(ArrayList<Rectangle> rectangles) {
        Rectangles = rectangles;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public double getArea() {
        double Area = 0;
        for (Circle circle : Circles) Area += circle.getArea();
        for (Rectangle rectangle : Rectangles) Area += rectangle.getArea();
        return Area;
    }
}
