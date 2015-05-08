package pellin.pxl.essentials.hoofdstuk10;

/**
 * Created by net04 on 28/04/2015.
 */
public enum Day {
    MAANDAG(true),
    DINSDAG(true),
    WOENSDAG(true),
    DONDERDAG(true),
    VRIJDAG(true),
    ZATERDAG(false),
    ZONDAG(false);

    private boolean weekdag;

    Day(boolean weekdag){
        this.weekdag=weekdag;
    }

    public boolean getWeekdag() {
        return weekdag;
    }


    @Override
    public String toString() {
        return name()+"("+weekdag+")";
    }
}
