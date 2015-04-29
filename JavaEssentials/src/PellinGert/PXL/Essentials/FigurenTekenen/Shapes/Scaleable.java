package PellinGert.PXL.essentials.figurentekenen.shapes;

/**
 * Created by net04 on 28/04/2015.
 * Hoofdstuk 11 Opdracht 1
 */
public interface Scaleable {
    int QUARTER = 25;
    int HALF = 50;
    int DOUBLE = 200;

    void scale(int factor);

    default void scaleDouble() {
        scale(DOUBLE);
    }

    default void scaleHalf() {
        scale(HALF);
    }

    default void scaleQuarter() {
        scale(QUARTER);
    }
}
