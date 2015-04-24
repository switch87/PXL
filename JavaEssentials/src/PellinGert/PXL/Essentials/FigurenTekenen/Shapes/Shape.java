package PellinGert.PXL.Essentials.FigurenTekenen.Shapes;

/**
 * Created by gert on 5/04/2015.
 */
public abstract class Shape {
    private static int count = 0;
    private int x, y;

    public Shape(int x, int y) {
        setX(x);
        setY(y);
        count++;
    }

    public Shape() {
        this(0, 0);
    }

    public static int getCount() {
        return count;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPosition(int x, int y) {
        setX(x);
        setY(y);
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "X=" + x +
                ", Y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape)) return false;

        Shape shape = (Shape) o;

        if (getX() != shape.getX()) return false;
        return getY() == shape.getY();

    }

    @Override
    public int hashCode() {
        int result = getX();
        result = 31 * result + getY();
        return result;
    }
}
