package PellinGert.PXL.Essentials.FigurenTekenen.Shapes;

/**
 * Created by gert on 5/04/2015.
 */
public class Triangle extends Shape {
    private static final int ANGLES = 3;
    private static final String Description = "triangle";
    private static int Count = 0;
    private int Height, Width, Perpendicular;

    public Triangle(int width, int height, int perpendicular, int x, int y) {
        super(x, y);
        setHeight(height);
        setWidth(width);
        setPerpendicular(perpendicular);
        Count++;
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

    public static int getANGLES() {
        return ANGLES;
    }

    public static int getCount() {
        return Count;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height < 0 ? -height : height;
    }

    public int getWidth() {
        return Width;
    }

    public void setWidth(int width) {
        Width = width < 0 ? -width : width;
    }

    public int getPerpendicular() {
        return Perpendicular;
    }

    public void setPerpendicular(int perpendicular) {
        Perpendicular = perpendicular > getWidth() ? getWidth() - perpendicular : perpendicular;
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
        Height += (growH < -Height ? -Height : growH);
        Width += (growW < -Width ? -Width : growW);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "Height=" + Height +
                ", Width=" + Width +
                ", Perpendicular=" + Perpendicular +
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
}
