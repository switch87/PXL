package PellinGert.PXL.essentials.figurentekenen;

import PellinGert.PXL.essentials.figurentekenen.shapes.Drawable;

import java.awt.*;

/**
 * Created by gp on 23/04/15.
 * Hoofdstuk 9: Opdracht 10
 *
 * Hoofdstuk 11: Opdracht 2
 * Door de array van Shape naar Drawable om te zetten werkt toString niet meer,
 * oplossing moet nog gezocht worden
 */
public class Drawing implements Drawable{

    private Drawable drawables[] = new Drawable[100];
    private int size = 0;

    public void add(Drawable drawable) {
        if (!isPresent(drawable)) {
            drawables[getSize()] = drawable;
            size++;
        }
        else System.out.println("Shape is already present");
    }

    public void remove(Drawable drawable) {
        int drawableIndex=indexOf(drawable);

        // aanmaken copie array en originele wissen
        Drawable drawablesCopy[]=makeDuplicate();
        clear();

        // Alles drawables behalve de te verwijderen drawable terugzetten
        for (int i = 0; i < drawableIndex; i++) drawables[i]=drawablesCopy[i];
        for (int i = drawableIndex+1; i < size; i++) drawables[i-1]=drawablesCopy[i];

        size--;
    }

    public void clear() {
        for (int i = 0; i < getSize(); i++) {
            drawables[i]=null;
            size = 0;
        }
    }

    public int getSize() {
        return size;
    }

    private boolean isPresent(Drawable drawable)
    {
        for (int i = 0; i < getSize(); i++) {
            if (drawable.equals(drawables[i])) return true;
        }
        return false;
    }

    public Integer indexOf(Drawable drawable)     // Integer in plaats van int om NULLABLE type te bekomen
    {
        for (int i = 0; i < getSize(); i++) {
            if (drawable.equals(drawables[i])) return i;
        }
        return null;
    }

    public Drawable[] makeDuplicate()
    {
        Drawable drawablesDuplicate[]=new Drawable[100];
        for (int i = 0; i < getSize(); i++) {
            drawablesDuplicate[i]=drawables[i];
        }
        return drawablesDuplicate;
    }

    @Override
    public void Draw(Graphics g) {
        for (Drawable drawable: drawables)
        {
            drawable.Draw(g);
        }
    }

    @Override
    public void scale(int factor) {
        for (Drawable drawable: drawables)
        {
            drawable.scale(factor);
        }
    }

    @Override
    public String toString() {
        String toString = "";
        for (Drawable drawable : drawables) {
            toString+=((Shape)drawable).toString();
        }
        return toString;
    }
}
