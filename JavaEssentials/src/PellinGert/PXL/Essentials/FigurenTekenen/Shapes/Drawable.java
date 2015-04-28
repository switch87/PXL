package PellinGert.PXL.essentials.figurentekenen.shapes;

import java.awt.*;

/**
 * Created by net04 on 28/04/2015.
 * Hoofdstuk 11 Opdracht 2
 *
 * deze interface wordt geimplementeerd in Shape en in Logo,
 * de definitie wordt pas gedaan in de extended classes van Shape.
 */
public interface Drawable extends Scaleable {
    public void Draw(Graphics g);

}
