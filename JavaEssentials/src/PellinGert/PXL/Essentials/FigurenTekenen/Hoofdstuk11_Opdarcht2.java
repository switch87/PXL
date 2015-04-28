package PellinGert.PXL.essentials.figurentekenen;

import PellinGert.PXL.essentials.figurentekenen.shapes.*;

import static java.lang.System.out;

/**
 * Created by net04 on 28/04/2015.
 * Hoofdstuk 11 Opdracht 2
 */
public class Hoofdstuk11_Opdarcht2 {
    public static void main(String[] args) {
        Drawable s1 = new Circle(5, 5, 5);
        Drawable s2 = new Rectangle(5, 8, 7, 1);
        Drawable s3 = new Square(8, 5, 4);
        Drawable s4 = new IsoScalesTriangle(15,33,7,5);

        Drawing drawing = new Drawing();
        drawing.add(s1);
        drawing.add(s2);
        drawing.add(s3);
        drawing.add(s4);
        
        out.println("Oude dimenties:\n");
            out.println(drawing.toString());

        ((Circle)s1).scaleHalf();
        ((Rectangle)s2).scaleDouble();
        ((Square)s3).scale(55);
        ((IsoScalesTriangle)s4).scaleQuarter();

        out.println("\nNieuwe dimenties:\n");
        out.println(drawing.toString());
    }
}
