package pellin.pxl.essentials.hoofdstuk6;

public class opdracht5 {
    public static void main(String[] args) {
        Double Feet2Meter = 0.3;
        for (int i = 1; i <= 20; i++) {
            System.out.format("%d meter = %.2f feet\n", i, (i / Feet2Meter));
        }
    }
}
