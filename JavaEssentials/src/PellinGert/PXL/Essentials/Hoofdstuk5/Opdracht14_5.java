package PellinGert.PXL.Essentials.Hoofdstuk5;

public class Opdracht14_5 {
    public static void main(String[] archs) {
        for (int i = -10; i <= 10; i++) {
            String j = (i > 0) ? (String) ("+" + i) : Integer.toString(i);
            System.out.println(j);
        }
    }

}