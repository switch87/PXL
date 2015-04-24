package PellinGert.PXL.Essentials.FigurenTekenen;

import PellinGert.PXL.Essentials.FigurenTekenen.Shapes.*;

import java.util.ArrayList;

/**
 * Created by gp on 23/04/15.
 * Hoofdstuk 9: Opdracht 10
 */
public class Drawing {

    private Shape shapes[] = new Shape[100];
    private int size = 0;

    public void add(Shape shape) {
        if (!isPresent(shape)) {
            shapes[getSize()] = shape;
            size++;
        }
        else System.out.println("Shape is already present");
    }

    public void remove(Shape shape) {
        int shapeIndex=indexOf(shape);

        // aanmaken copie array en originele wissen
        Shape shapesCopy[]=makeDuplicate();
        clear();

        // Alles shapes behalve de te verwijderen shape terugzetten
        for (int i = 0; i < shapeIndex; i++) shapes[i]=shapesCopy[i];
        for (int i = shapeIndex+1; i < size; i++) shapes[i-1]=shapesCopy[i];

        size--;
    }

    public void clear() {
        for (int i = 0; i < getSize(); i++) {
            shapes[i]=null;
            size = 0;
        }
    }

    public int getSize() {
        return size;
    }

    private boolean isPresent(Shape shape)
    {
        for (int i = 0; i < getSize(); i++) {
            if (shape.equals(shapes[i])) return true;
        }
        return false;
    }

    public Integer indexOf(Shape shape)
    {
        for (int i = 0; i < getSize(); i++) {
            if (shape.equals(shapes[i])) return i;
        }
        return null;
    }

    public Shape[] makeDuplicate()
    {
        Shape shapesDuplicate[]=new Shape[100];
        for (int i = 0; i < getSize(); i++) {
            shapesDuplicate[i]=shapes[i];
        }
        return shapesDuplicate;
    }
}
