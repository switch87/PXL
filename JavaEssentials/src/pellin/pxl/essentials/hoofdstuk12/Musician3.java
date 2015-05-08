package pellin.pxl.essentials.hoofdstuk12;

/**
 * Created by gert on 4/05/2015.
 * Hoofdstuk 12: opdracht 3
 */
public class Musician3 {
    public void play(){
        Instrument instrument = new Instrument() {
            @Override
            public void makeNoise() {

            }
        };
        instrument.makeNoise();
    }
}
