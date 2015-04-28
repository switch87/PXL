package PellinGert.PXL.essentials.figurentekenen.shapes;

/**
 * Created by net04 on 21/04/2015.
 */
public class RightAngledTriangle extends Triangle {
    private static int count = 0;

    public RightAngledTriangle(int width, int height, int x, int y) {
        super(width, height, 0, x, y);
        count++;
    }

    public RightAngledTriangle(int width, int height) {
        this(width, height, 0, 0);
    }

    public RightAngledTriangle() {
        this(0, 0, 0, 0);
    }

    public RightAngledTriangle(RightAngledTriangle other) {
        this(other.getWidth(), other.getHeight(), other.getX(), other.getY());
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void setPerpendicular(int perpendicular) {
        if (perpendicular != 0) System.out.println("The perpendicular of a Right Angled Triangle Can't be set!");
        super.setPerpendicular(0);
    }

    @Override
    public double getPerimeter() {
        return Math.sqrt(Math.pow(getWidth(), 2) + Math.pow(getHeight(), 2)) + getWidth() + getHeight();
    }

    @Override
    public String toString() {
        return "Right Angled Triangle{" +
                "Height=" + getHeight() +
                ", Width=" + getWidth() +
                ", Perpendicular=" + getPerpendicular() +
                "X=" + getX() +
                ", Y=" + getY() +
                '}';
    }


}
