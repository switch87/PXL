package PellinGert.PXL.Essentials.FigurenTekenen;

/**
 * Created by net04 on 21/04/2015.
 */
public class EquilateralTriangles extends IsoScalesTriangle {
    private static int Count = 0;

    public EquilateralTriangles(int width, int x, int y) {
        super(width, (int) Math.sqrt(Math.pow(width, 2) - Math.pow(width / 2, 2)), x, y);
        Count++;
    }

    public EquilateralTriangles(int width) {
        this(width, 0, 0);
    }

    public EquilateralTriangles() {
        this(0, 0, 0);
    }

    public EquilateralTriangles(EquilateralTriangles other) {
        this(other.getWidth(), other.getX(), other.getY());
    }

    public static int getCount() {
        return Count;
    }

    @Override
    public double getPerimeter() {
        return 3 * getWidth();
    }

    @Override
    public String toString() {
        return "Equilateral Triangle{" +
                "Height=" + getHeight() +
                ", Width=" + getWidth() +
                ", Perpendicular=" + getPerpendicular() +
                ", X=" + getX() +
                ", Y=" + getY() +
                '}';
    }
}
