package PellinGert.PXL.Essentials.FigurenTekenen.Shapes;

/**
 * Created by gert on 4/04/2015.
 */
public class Circle extends Shape {

    private static final int ANGLES = 0;
    private static final String Description = "circle";
    private static int Count = 0;
    private int Radius;

    public Circle(int Radius, int x, int y) {
        super(x, y);
        setRadius(Radius);
        Count++;
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
        return Count;
    }

    public String getDescription() {
        return Description;
    }

    public int getRadius() {
        return Radius;
    }

    public void setRadius(int Radius) {
        this.Radius = Radius < 0 ? -Radius : Radius;
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
                "Radius=" + Radius +
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
}
