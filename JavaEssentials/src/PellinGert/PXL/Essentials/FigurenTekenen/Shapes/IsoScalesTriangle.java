package PellinGert.PXL.Essentials.FigurenTekenen.Shapes;

/**
 * Created by net04 on 21/04/2015.
 */
public class IsoScalesTriangle extends Triangle {
    private static int count = 0;

    public IsoScalesTriangle(int width, int height, int x, int y) {
        super(width, height, width / 2, x, y);
        count++;
    }

    public IsoScalesTriangle(int width, int height) {
        this(width, height, 0, 0);
    }

    public IsoScalesTriangle() {
        this(0, 0, 0, 0);
    }

    public IsoScalesTriangle(IsoScalesTriangle other) {
        this(other.getWidth(), other.getHeight(), other.getX(), other.getY());
    }

    public static int getCount() {
        return count;
    }

    @Override
    public int getPerpendicular() {
        return getWidth() / 2;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.sqrt(Math.pow(getWidth() / 2, 2) + Math.pow(getHeight(), 2)) + getWidth();
    }

    @Override
    public String toString() {
        return "Isoscales Triangle{" +
                "Height=" + getHeight() +
                ", Width=" + getWidth() +
                ", Perpendicular=" + getPerpendicular() +
                ", X=" + getX() +
                ", Y=" + getY() +
                '}';
    }
}
