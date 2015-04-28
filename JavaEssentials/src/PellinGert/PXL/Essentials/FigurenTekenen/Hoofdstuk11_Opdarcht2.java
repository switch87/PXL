package PellinGert.PXL.essentials.figurentekenen;

import PellinGert.PXL.essentials.figurentekenen.shapes.*;

import static java.lang.System.out;

/**
 * Created by net04 on 28/04/2015.
 * Hoofdstuk 11 Opdracht 2
 */
public class Hoofdstuk11_Opdarcht2 {
    public static void main(String[] args) {
        Scaleable s1 = new Circle(5, 5, 5);
        Scaleable s2 = new Rectangle(5, 8, 7, 1);
        Scaleable s3 = new Square(8, 5, 4);
        Scaleable s4 = new IsoScalesTriangle(15,33,7,5);

        Scaleable scalables[]={s1,s2,s3,s4};

        out.println("Oude dimenties:\n");
        for (Scaleable scaleable: scalables) {
            out.println(scaleable.toString());
        }

        ((Circle)s1).scaleHalf();
        ((Rectangle)s2).scaleDouble();
        ((Square)s3).scale(55);
        ((IsoScalesTriangle)s4).scaleQuarter();

        out.println("\nNieuwe dimenties:\n");
        for (Scaleable scaleable: scalables) {
            out.println(scaleable.toString());
        }
    }
}
