package PellinGert.PXL.Essentials.FigurenTekenen.Shapes;

/**
 * Created by gert on 4/04/2015.
 */
public class Square extends Rectangle {
    private static final String Description = "square";
    private static int Count = 0;

    public Square(int Side, int X, int Y) {
        super(Side, Side, X, Y);
        Count++;
    }

    public Square(int Side) {
        this(Side, 0, 0);
    }

    public Square() {
        this(0, 0, 0);
    }

    public Square(Square Other) {
        this(Other.getSide(), Other.getX(), Other.getY());
    }

    public static int getCount() {
        return Count;
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
}
