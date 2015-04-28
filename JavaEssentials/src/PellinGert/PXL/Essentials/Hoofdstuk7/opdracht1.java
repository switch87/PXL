package PellinGert.PXL.essentials.Hoofdstuk7;

public class opdracht1 {

    public static void main(String[] args) {
        int[] veelvoudenVanZeven = new int[20];
        int veelvoud = 7;
        for (int i = 0; i < veelvoudenVanZeven.length; i++) {
            veelvoudenVanZeven[i] = veelvoud;
            veelvoud += 7;
        }
        for (int getal : veelvoudenVanZeven) {
            System.out.print(getal + " ");
        }

        System.out.println();
        for (int i = veelvoudenVanZeven.length - 1; i >= 0; i--) {
            System.out.print(veelvoudenVanZeven[i] + " ");
        }

    }

}
