package PellinGert.PXL.Essentials.Hoofsdstuk8;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by gert on 4/04/2015.
 */
public class Opdracht12 {
    public static void main(String[] args) {
        GregorianCalendar Cal = new GregorianCalendar(1987, 2, 5, 15, 0, 0);
        System.out.print("Ik ben geboren op een ");
        switch (Cal.get(Calendar.DAY_OF_WEEK)) {
            case 1:
                System.out.println("zondag.");
                break;
            case 2:
                System.out.println("maandag.");
                break;
            case 3:
                System.out.println("dinsdag.");
                break;
            case 4:
                System.out.println("woensdag.");
                break;
            case 5:
                System.out.println("donderdag.");
                break;
            case 6:
                System.out.println("vrijdag.");
                break;
            case 7:
                System.out.println("zaterdag.");
                break;
        }
    }

}
