package pellingert.pxl.essentials.figurentekenen;

import pellingert.pxl.essentials.figurentekenen.shapes.Drawable;

import java.awt.*;
import java.util.Iterator;

/**
 * Created by gp on 23/04/15.
 * Hoofdstuk 9: Opdracht 10
 * @author gp
 */

public class Drawing implements Drawable, java.lang.Iterable {


    public class DrawableIterator implements java.util.Iterator {
        private int handled, nextId;

        public DrawableIterator() {
            handled = 0;
            nextId = 0;
        }

        @Override
        public boolean hasNext() {
            if (getSize() > handled) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if (hasNext()) {
                handled++;
                while (true) {
                    Object next = drawables[nextId];
                    nextId++;

                    /*
                    Volgende if is niet nodig in mijn versie van Drawing,
                    maar voor compatibiliteit met anderen hun klasse heb ik hem toch toegevoegd.

                    Indien het volgende element van de array niet leeg is wordt dit teruggegeven,
                    anders wordt het volgende element bekeken ...
                    */

                    if (next != null) {
                        return next;
                    }

                }
            }
            return null;
        }

        @Override
        public void remove() {
            try {
                finalize();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
    }

    private Drawable drawables[] = new Drawable[100];
    private int size = 0;

    /**
     *
     * @param drawable
     */
    public void add(Drawable drawable) {
        if (!isPresent(drawable)) {
            drawables[getSize()] = drawable;
            size++;
        } else System.out.println("Shape is already present");
    }

    public void remove(Drawable drawable) {
        int drawableIndex = indexOf(drawable);

        // aanmaken copie array en originele wissen
        Drawable drawablesCopy[] = makeDuplicate();
        clear();

        // Alles drawables behalve de te verwijderen drawable terugzetten
        for (int i = 0; i < drawableIndex; i++) drawables[i] = drawablesCopy[i];
        for (int i = drawableIndex + 1; i < size; i++) drawables[i - 1] = drawablesCopy[i];

        size--;
    }

    public void clear() {
        for (int i = 0; i < getSize(); i++) {
            drawables[i] = null;
            size = 0;
        }
    }

    public int getSize() {
        return size;
    }

    private boolean isPresent(Drawable drawable) {
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

    public Drawable[] makeDuplicate() {
        Drawable drawablesDuplicate[] = new Drawable[100];
        for (int i = 0; i < getSize(); i++) {
            drawablesDuplicate[i] = drawables[i];
        }
        return drawablesDuplicate;
    }

    @Override
    public void Draw(Graphics g) {
        for (int i = 0; i < getSize(); i++) {
            drawables[i].Draw(g);
        }
    }

    @Override
    public void scale(int factor) {
        for (int i = 0; i < getSize(); i++) {
            drawables[i].scale(factor);
        }
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < getSize(); i++) {
            string.append(drawables[i] + "\n");
        }
        return string.toString();
    }

    @Override
    public Iterator iterator() {
        return new DrawableIterator();
    }
}
