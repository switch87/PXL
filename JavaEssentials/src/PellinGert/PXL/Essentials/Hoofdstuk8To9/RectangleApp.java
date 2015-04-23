package PellinGert.PXL.Essentials.Hoofdstuk8To9;

/**
 * Created by gert on 4/04/2015.
 */

public class RectangleApp {
    public static void main(String[] args) {
        System.out.println("This program uses a rectangle");
        Rectangle rect = new Rectangle();
        rect.setHeight(-5);
        rect.setWidth(-3);
        System.out.println(rect.getHeight() + " " + rect.getWidth());
        rect.grow(-1, -1);
        System.out.println(rect.getHeight() + " " + rect.getWidth());

    }
}
