package PellinGert.PXL.Essentials.Hoofdstuk8To9;

/**
 * Created by net04 on 21/04/2015.
 */
public class TriangleApp {

    public static void main(String[] args) {
        System.out.println("This program uses a Triangle");
        RightAngledTriangle Tria = new RightAngledTriangle(5, 8, 1, 2);
        System.out.println(Tria.getHeight() + " " + Tria.getWidth());
        Tria.setPerpendicular(5);
        System.out.println(Tria.getHeight() + " " + Tria.getWidth());

    }
}
