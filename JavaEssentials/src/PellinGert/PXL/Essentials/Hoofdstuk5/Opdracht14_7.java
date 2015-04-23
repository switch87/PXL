package PellinGert.PXL.Essentials.Hoofdstuk5;

public class Opdracht14_7 {
    public static void main(String[] args) {
        for (int i = 6; i < 10000; i = i + 6) {
            if (i % 28 == 0) System.out.println(i);
        }
    }

}
