package PellinGert.PXL.essentials.figurentekenen.shapes;

import java.awt.*;

/**
 * Created by gert on 4/04/2015.
 */
public class Rectangle extends Shape {
    private static final String description = "Rectangle";
    private static final int ANGLES = 4;
    private static int count = 0;
    private int height, width;

    public Rectangle(int height, int width, int x, int y) {
        super(x, y);
        setHeight(height);
        setWidth(width);
        count++;
    }

    public Rectangle(int height, int width) {
        this(height, width, 0, 0);
    }

    public Rectangle() {
        this(0, 0, 0, 0);
    }

    public Rectangle(Rectangle Other) {
        this(Other.getHeight(), Other.getWidth(), Other.getX(), Other.getY());
    }

    public static int getCount() {
        return count;
    }

    public static int getAngles() {
        return ANGLES;
    }

    public String getDescription() {
        return description;
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return 2 * (height + width);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height < 0 ? -height : height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width < 0 ? -width : width;
    }

    public void grow(int d) {
        grow(d, d);
    }

    public void grow(int growH, int growW) {
        height += (growH < -height ? -height : growH);
        width += (growW < -width ? -width : growW);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "Height=" + height +
                ", Width=" + width +
                ", X=" + getX() +
                ", Y=" + getY() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        if (!super.equals(o)) return false;

        Rectangle rectangle = (Rectangle) o;

        if (getHeight() != rectangle.getHeight()) return false;
        return getWidth() == rectangle.getWidth();

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getHeight();
        result = 31 * result + getWidth();
        return result;
    }

    @Override
    public void Draw(Graphics g) {

    }

    @Override
    public void scale(int factor) {
        setHeight((height * factor) / 100);
        setWidth((width * factor) / 100);
    }
}
