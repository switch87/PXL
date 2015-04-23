package PellinGert.PXL.Essentials.Hoofdstuk7;

/**
 * Created by gert on 4/04/2015.
 */
public class opdracht3 {
    public static void main(String[] args) {
        int[][] Product = new int[4][6];
        for (int i = 0; i < Product.length; i++) {
            for (int j = 0; j < Product[i].length; j++) {
                Product[i][j] = (i + 1) * (j + 1);
                System.out.print(Product[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
