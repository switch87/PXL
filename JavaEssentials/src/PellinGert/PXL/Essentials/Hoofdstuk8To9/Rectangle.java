package PellinGert.PXL.Essentials.Hoofdstuk8To9;

/**
 * Created by gert on 4/04/2015.
 */
public class Rectangle extends Shape {
    private static final String Description = "Rectangle";
    private static final int ANGLES = 4;
    private static int Count = 0;
    private int Height, Width, X, Y;

    public Rectangle(int Height, int Width, int x, int y) {
        super(x, y);
        setHeight(Height);
        setWidth(Width);
        Count++;
    }

    public Rectangle(int Height, int Width) {
        this(Height, Width, 0, 0);
    }

    public Rectangle() {
        this(0, 0, 0, 0);
    }

    public Rectangle(Rectangle Other) {
        this(Other.getHeight(), Other.getWidth(), Other.getX(), Other.getY());
    }

    public static int getCount() {
        return Count;
    }

    public static int getAngles() {
        return ANGLES;
    }

    public String getDescription() {
        return Description;
    }

    public double getArea() {
        return Height * Width;
    }

    public double getPerimeter() {
        return 2 * (Height + Width);
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

    public void grow(int d) {
        grow(d, d);
    }

    public void grow(int growH, int growW) {
        Height += (growH < -Height ? -Height : growH);
        Width += (growW < -Width ? -Width : growW);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + (getHeight() * 17) + (getWidth() * 23);
    }
}
