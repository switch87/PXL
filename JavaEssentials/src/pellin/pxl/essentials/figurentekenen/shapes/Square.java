package pellingert.pxl.essentials.figurentekenen.shapes;

/**
 * Created by gert on 4/04/2015.
 */
public class Square extends Rectangle {
    private static final String Description = "square";
    private static int count = 0;

    public Square(int side, int x, int y) {
        super(side, side, x, y);
        count++;
    }

    public Square(int side) {
        this(side, 0, 0);
    }

    public Square() {
        this(0, 0, 0);
    }

    public Square(Square Other) {
        this(Other.getSide(), Other.getX(), Other.getY());
    }

    public static int getCount() {
        return count;
    }

    public int getSide() {
        return getHeight();
    }

    public void setSide(int Side) {
        super.setHeight(Side);
        super.setWidth(Side);
    }

    @Override
    public void setHeight(int Side) {
        setSide(Side);
    }

    @Override
    public void setWidth(int Side) {
        setSide(Side);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " (" + Description + ")";
    }



    @Override
    public String toString() {
        return "Square{" +
                "Height=" + getHeight() +
                ", Width=" + getWidth() +
                ", X=" + getX() +
                ", Y=" + getY() +
                '}';
    }

    @Override
    public void scale(int factor) {
        setSide((getSide()*factor)/100);
    }
}
