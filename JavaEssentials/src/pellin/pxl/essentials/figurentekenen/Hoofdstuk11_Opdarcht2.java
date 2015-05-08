package pellingert.pxl.essentials.figurentekenen;

import pellingert.pxl.essentials.figurentekenen.shapes.*;

import static java.lang.System.out;

/**
 * Created by gp on 28/04/15.
 * Hoofdstuk 11 Opdracht 2
 */
public class Hoofdstuk11_Opdarcht2 {
    public static void main(String[] args) {

        Drawing drawing = new Drawing();
        drawing.add(new Circle(50, 5, 5));
        drawing.add(new Rectangle(50, 80, 7, 1));
        drawing.add(new Square(80, 5, 4));
        drawing.add(new IsoScalesTriangle(150, 330, 7, 5));
        out.println("Oude dimenties:\n" + drawing.toString());

        drawing.scale(20);
        out.println("\nNieuwe dimenties (20%):\n" + drawing.toString());


        drawing.scaleDouble();
        out.println("\nNieuwe dimenties (200%):\n" + drawing.toString());


        drawing.scaleHalf();
        out.println("\nNieuwe dimenties (50%):\n" + drawing.toString());
    }
}
