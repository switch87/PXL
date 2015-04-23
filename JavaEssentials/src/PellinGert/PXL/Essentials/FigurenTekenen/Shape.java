package PellinGert.PXL.Essentials.FigurenTekenen;

/**
 * Created by gert on 5/04/2015.
 */
public abstract class Shape {
    private static int Count = 0;
    private int X, Y;

    public Shape(int x, int y) {
        setX(x);
        setY(y);
        Count++;
    }

    public Shape() {
        this(0, 0);
    }

    public static int getCount() {
        return Count;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
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
                "X=" + X +
                ", Y=" + Y +
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
