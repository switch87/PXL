package PellinGert.PXL.Essentials.FigurenTekenen;

import java.util.ArrayList;
import PellinGert.PXL.Essentials.FigurenTekenen.Shapes.*;

/**
 * Created by gp on 23/04/15.
 */
public class Hoofdstuk9_Opdracht9 {
    public static void main(String[] args) {
        ArrayList<Shape> Shapes = new ArrayList<>();
        Shapes.add(new Circle(5,5,5));
        Shapes.add(new Rectangle(5,8,7,1));
        Shapes.add(new Square(8,5,4));
        Shapes.add(new Square(((Square) Shapes.get(2))));
        Shapes.add(new Rectangle());
        Shapes.add(new Square(8));
        Shapes.add(new Square());
        Shapes.add(new Circle());
        Shapes.add(new IsoScalesTriangle(8,5));
        Shapes.add(new EquilateralTriangles(7));

        for (Shape shape : Shapes)
        {
            System.out.print("X: " + shape.getX() + ", Y: " + shape.getY()+
                        ", Omtrek: " + shape.getPerimeter() + ", Oppervlakte: "+shape.getArea());
            if (shape instanceof Circle)
            {
                Circle circle = (Circle) shape;
                System.out.print(", Radius: "+circle.getRadius());
            }
            else if (shape instanceof Rectangle)
            {
                Rectangle rectangle = (Rectangle) shape;
                System.out.print(", Width: "+rectangle.getWidth()+", Height: "+rectangle.getHeight());
            }
            else if (shape instanceof Triangle) {
                Triangle triangle = (Triangle) shape;
                System.out.print(", Width: " + triangle.getWidth()+", Height: "+triangle.getHeight()+
                        ", Perpendicular: "+triangle.getPerpendicular());
            }
            System.out.println();
        }
        System.out.println("\n2de manier:\n");
        for (Shape shape : Shapes) {
            System.out.println(shape.toString());
            System.out.println("Omtrek: " + shape.getPerimeter() + ", Oppervlakte: " + shape.getArea()+"\n");
        }
    }
}
