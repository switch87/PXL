package PellinGert.PXL.Essentials.FigurenTekenen;

import PellinGert.PXL.Essentials.FigurenTekenen.Shapes.*;

import java.util.ArrayList;

/**
 * Created by gp on 23/04/15.
 * Hoofdstuk 9: Opdracht 10
 */
public class Drawing {

    private ArrayList<Shape> Shapes = new ArrayList<>();

    public void add(Shape shape) {
        Shapes.add(shape);
    }

    public void remove(Shape shape) {
        Shapes.remove(shape);
    }

    public void clear() {
        Shapes.clear();
    }

    public int getSize() {
        return Shapes.size();
    }
}
