package PellinGert.PXL.Essentials.FigurenTekenen;

import PellinGert.PXL.Essentials.FigurenTekenen.Shapes.*;

import java.util.ArrayList;

/**
 * Created by gp on 23/04/15.
 * Hoofdstuk 9: Opdracht 10 punt 5
 */
public class DrawingApp {
    public static void main(String[] args) {
        Drawing Shapes = new Drawing();
        System.out.println("Size: "+Shapes.getSize());
        Shapes.add(new Circle(5, 5, 5));
        System.out.println("Size: "+Shapes.getSize());
        Shapes.add(new Rectangle(5, 8, 7, 1));
        System.out.println("Size: "+Shapes.getSize());
        Shapes.add(new Square(8, 5, 4));
        System.out.println("Size: "+Shapes.getSize());
        Shapes.add(new Rectangle());
        System.out.println("Size: "+Shapes.getSize());
        Shapes.add(new Square(8));
        System.out.println("Size: "+Shapes.getSize());
        Shapes.add(new Square());
        System.out.println("Size: "+Shapes.getSize());
        Shapes.add(new Circle());
        System.out.println("Size: "+Shapes.getSize());
        Shapes.add(new IsoScalesTriangle(8, 5));
        System.out.println("Size: "+Shapes.getSize());
        Shapes.add(new EquilateralTriangles(7));
        System.out.println("Size: "+Shapes.getSize());
        Shapes.clear();
        System.out.println("Size after clear: "+Shapes.getSize());

    }
}
