package PellinGert.PXL.essentials.figurentekenen.shapes;

/**
 * Created by net04 on 28/04/2015.
 * Hoofdstuk 11 Opdracht 1
 */
public interface Scaleable {
    public static final int QUARTER = 25;
    public static final int HALF = 50;
    public static final int DOUBLE = 200;

    public abstract void scale(int factor);

    public default void scaleDouble() {
        scale(DOUBLE);
    }

    public default void scaleHalf() {
        scale(HALF);
    }

    public default void scaleQuarter() {
        scale(QUARTER);
    }
}
