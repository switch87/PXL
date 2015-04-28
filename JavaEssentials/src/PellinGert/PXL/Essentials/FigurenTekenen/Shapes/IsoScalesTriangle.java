package PellinGert.PXL.essentials.figurentekenen.shapes;

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
    public void setWidth(int width) {
        super.setWidth(width);
        setPerpendicular(width/2);
    }

    @Override
    public void setPerpendicular(int perpendicular) {
        if (perpendicular !=getWidth()/2)
        {
            System.out.println("Perpendicular of isoscales triangle can't be altered, try converting to regular triangle");
        }
        else
        {
            super.setPerpendicular(getWidth() / 2);
        }
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
