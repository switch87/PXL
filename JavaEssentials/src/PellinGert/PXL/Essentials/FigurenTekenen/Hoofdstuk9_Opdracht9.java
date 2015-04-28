package PellinGert.PXL.essentials.figurentekenen;

import java.util.ArrayList;

import PellinGert.PXL.essentials.figurentekenen.shapes.*;

/**
 * Created by gp on 23/04/15.
 */
public class Hoofdstuk9_Opdracht9 {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5,5,5));
        shapes.add(new Rectangle(5,8,7,1));
        shapes.add(new Square(8,5,4));
        shapes.add(new Square(((Square) shapes.get(2))));
        shapes.add(new Rectangle());
        shapes.add(new Square(8));
        shapes.add(new Square());
        shapes.add(new Circle());
        shapes.add(new IsoScalesTriangle(8,5));
        shapes.add(new EquilateralTriangles(7));

        for (Shape shape : shapes)
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
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
            System.out.println("Omtrek: " + shape.getPerimeter() + ", Oppervlakte: " + shape.getArea()+"\n");
        }
    }
}
