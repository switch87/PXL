package pellin.pxl.essentials.hoofdstuk12;

/**
 * Created by gert on 4/05/2015.
 * Hoofdstuk 12: opdracht 1 en 2
 */
public class Musician {

    public void play() {
        Instrument instrument=new Instrument();
        instrument.makeNoise();
    }

    class Instrument {
        public Instrument(){}

        public void makeNoise() {
        }
    }
}
