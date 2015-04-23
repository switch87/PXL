package PellinGert.PXL.Essentials.Hoofdstuk8To9;

/**
 * Created by net04 on 21/04/2015.
 */
public class IsoScalesTriangle extends Triangle {
    private static int Count = 0;

    public IsoScalesTriangle(int width, int height, int x, int y) {
        super(width, height, width / 2, x, y);
        Count++;
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
        return Count;
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
    public int hashCode() {
        return super.hashCode() + (getPerpendicular() * 53);
    }
}
