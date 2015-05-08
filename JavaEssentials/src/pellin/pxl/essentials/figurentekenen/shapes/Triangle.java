package pellingert.pxl.essentials.figurentekenen.shapes;

import java.awt.*;

/**
 * Created by gert on 5/04/2015.
 */
public class Triangle extends Shape{
    private static final int ANGLES = 3;
    private static final String description = "triangle";
    private static int count = 0;
    private int height, width, perpendicular;

    public Triangle(int width, int height, int perpendicular, int x, int y) {
        super(x, y);
        setHeight(height);
        setWidth(width);
        setPerpendicular(perpendicular);
        count++;
    }

    public Triangle(int width, int height, int perpendicular) {
        this(width, height, perpendicular, 0, 0);
    }

    public Triangle() {
        this(0, 0, 0, 0, 0);
    }

    public Triangle(Triangle other) {
        this(other.getWidth(), other.getHeight(), other.getPerpendicular(), other.getX(), other.getY());
    }

    public static int getAngles() {
        return ANGLES;
    }

    public static int getCount() {
        return count;
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

    public int getPerpendicular() {
        return perpendicular;
    }

    public void setPerpendicular(int perpendicular) {
        this.perpendicular = perpendicular > getWidth() ? getWidth() - perpendicular : perpendicular;
    }

    @Override
    public double getArea() {
        return getHeight() * getWidth() / 2;
    }

    @Override
    public double getPerimeter() {
        return Math.sqrt(Math.pow(getPerpendicular(), 2) + Math.pow(getHeight(), 2))
                + Math.sqrt(Math.pow(getWidth() - getPerpendicular(), 2) + Math.pow(getHeight(), 2))
                + getWidth();
    }

    public void grow(int growH, int growW) {
        height += (growH < -height ? -height : growH);
        width += (growW < -width ? -width : growW);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "Height=" + height +
                ", Width=" + width +
                ", Perpendicular=" + perpendicular +
                "X=" + getX() +
                ", Y=" + getY() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        if (!super.equals(o)) return false;

        Triangle triangle = (Triangle) o;

        if (getHeight() != triangle.getHeight()) return false;
        if (getWidth() != triangle.getWidth()) return false;
        return getPerpendicular() == triangle.getPerpendicular();

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getHeight();
        result = 31 * result + getWidth();
        result = 31 * result + getPerpendicular();
        return result;
    }

    @Override
    public void Draw(Graphics g) {

    }

    @Override
    public void scale(int factor) {
        this.setWidth((this.width*factor)/100);
        this.setHeight((this.height*factor)/100);
    }
}
