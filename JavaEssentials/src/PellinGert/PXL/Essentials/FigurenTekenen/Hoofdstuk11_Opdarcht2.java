package PellinGert.PXL.essentials.figurentekenen;

import PellinGert.PXL.essentials.figurentekenen.shapes.Circle;
import PellinGert.PXL.essentials.figurentekenen.shapes.IsoScalesTriangle;
import PellinGert.PXL.essentials.figurentekenen.shapes.Rectangle;
import PellinGert.PXL.essentials.figurentekenen.shapes.Square;

import static java.lang.System.out;

/**
 * Created by net04 on 28/04/2015.
 * Hoofdstuk 11 Opdracht 2
 */
public class Hoofdstuk11_Opdarcht2 {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        drawing.add(new Circle(50, 50, 50));
        drawing.add(new Rectangle(50, 80, 70, 10));
        drawing.add(new Square(80, 50, 40));
        drawing.add(new IsoScalesTriangle(150, 330, 70, 50));

        out.println("Oude dimenties:\n");
        System.out.println(drawing.toString());

        drawing.scaleHalf();
        out.println("\nNieuwe dimenties (50%):\n");
        System.out.println(drawing.toString());

        drawing.scaleDouble();
        out.println("\nNieuwe dimenties (200%):\n");
        System.out.println(drawing.toString());

        drawing.scaleQuarter();
        out.println("\nNieuwe dimenties (25%):\n");
        System.out.println(drawing.toString());
    }
}
