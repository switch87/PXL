package PellinGert.PXL.essentials.figurentekenen;

import PellinGert.PXL.essentials.figurentekenen.shapes.*;

/**
 * Created by gp on 23/04/15.
 * Hoofdstuk 9: Opdracht 10 punt 5
 */
public class Hoofdstuk9_Opdracht10 {
    public static void main(String[] args) {
        Drawing shapes = new Drawing();
        System.out.println("Size: "+shapes.getSize());
        shapes.add(new Circle(5, 5, 5));
        System.out.println("Size: "+shapes.getSize());
        shapes.add(new Rectangle(5, 8, 7, 1));
        System.out.println("Size: "+shapes.getSize());
        shapes.add(new Square(8, 5, 4));
        System.out.println("Size: "+shapes.getSize());
        shapes.add(new Rectangle());
        System.out.println("Size: "+shapes.getSize());
        shapes.add(new Square(8));
        System.out.println("Size: "+shapes.getSize());
        shapes.add(new Square());
        System.out.println("Size: "+shapes.getSize());
        shapes.add(new Circle());
        System.out.println("Size: "+shapes.getSize());
        shapes.add(new IsoScalesTriangle(8, 5));
        System.out.println("Size: "+shapes.getSize());
        shapes.add(new EquilateralTriangles(7));
        System.out.println("Size: "+shapes.getSize());
        shapes.clear();
        System.out.println("Size after clear: "+shapes.getSize());

    }
}
