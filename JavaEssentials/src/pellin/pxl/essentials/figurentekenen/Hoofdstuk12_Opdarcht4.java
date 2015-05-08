package pellingert.pxl.essentials.figurentekenen;

import pellingert.pxl.essentials.figurentekenen.shapes.*;

import static java.lang.System.out;

/**
 * Created by gp on 04/05/15
 * Hoofdstuk 12 Opdracht 4
 */
public class Hoofdstuk12_Opdarcht4 {
    public static void main(String[] args) {

        Drawing drawing = new Drawing();
        drawing.add(new Circle(50, 5, 5));
        drawing.add(new Rectangle(50, 80, 7, 1));
        drawing.add(new Square(80, 5, 4));
        drawing.add(new IsoScalesTriangle(150, 330, 7, 5));

        for (Object s: drawing){
            out.println(s);
        }

    }
}
