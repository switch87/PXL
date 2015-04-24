package PellinGert.PXL.Essentials.FigurenTekenen;

import PellinGert.PXL.Essentials.FigurenTekenen.Shapes.*;

import java.util.ArrayList;

/**
 * Created by gp on 23/04/15.
 * Hoofdstuk 9: Opdracht 10
 */
public class Drawing {

    private Shape shapes[] = new Shape[100];

    public void add(Shape shape) {
        if (isPresent(shape)) {
            shapes[getSize()] = shape;
        }
        else System.out.println("Shape is already present");
    }

    public void remove(Shape shape) {
        int shapeIndex=indexOf(shape);

    }

    public void clear() {
        for (int i = 0; i < this.getSize(); i++) {
            shapes[i]=null;
        }
    }


    // voorlopig altijd false! Te veranderen!!!!
    public boolean equals(Shape shape) {
        return false;
    }

    public int getSize() {
        return shapes.length;
    }

    private boolean isPresent(Shape shape)
    {
        for (int i = 0; i < this.getSize(); i++) {
            if (shape.equals(shapes[i])) return true;
        }
        return false;
    }

    public Integer indexOf(Shape shape)
    {
        for (int i = 0; i < this.getSize(); i++) {
            if (shape.equals(shapes[i])) return i;
        }
        return null;
    }
}
