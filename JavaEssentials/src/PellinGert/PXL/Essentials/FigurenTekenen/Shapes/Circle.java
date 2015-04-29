package PellinGert.PXL.essentials.figurentekenen.shapes;

import java.awt.*;

/**
 * Created by gert on 4/04/2015.
 */
public class Circle extends Shape {

    private static final int ANGLES = 0;
    private static final String description = "circle";
    private static int count = 0;
    private int radius;

    public Circle(int Radius, int x, int y) {
        super(x, y);
        setRadius(Radius);
        count++;
    }

    public Circle(int Radius) {
        this(Radius, 0, 0);
    }

    public Circle(Circle Other) {
        this(Other.getRadius(), Other.getX(), Other.getY());
    }

    public Circle() {
        this(0, 0, 0);
    }

    public static int getAngles() {
        return ANGLES;
    }

    public static int getCount() {
        return count;
    }

    public String getDescription() {
        return description;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int Radius) {
        this.radius = Radius < 0 ? -Radius : Radius;
    }

    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public void grow(int d) {
        setRadius(getRadius() + Math.abs(d));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Radius=" + radius +
                ", X=" + getX() +
                ", Y=" + getY() +
                "} ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        if (!super.equals(o)) return false;

        Circle circle = (Circle) o;

        return getRadius() == circle.getRadius();

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getRadius();
        return result;
    }

    @Override
    public void Draw(Graphics g) {

    }

    @Override
    public void scale(int factor) {
        this.setRadius((this.radius * factor) / 100);
    }
}
