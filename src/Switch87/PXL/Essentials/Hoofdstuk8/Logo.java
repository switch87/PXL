package Switch87.PXL.Essentials.Hoofdstuk8;
import java.util.*;
/**
 * Created by gert on 4/04/2015.
 */
public class Logo {
    private ArrayList<Circle> Circles;
    private ArrayList<Rectangle> Rectangles;
    private String Text;

    public ArrayList<Circle> getCircle() {return Circles;}
    public ArrayList<Rectangle> getRectangle() {return Rectangles;}
    public String getText() {return Text;}
    public void setCircle(ArrayList<Circle> circles) {Circles = circles;}
    public void setRectangle(ArrayList<Rectangle> rectangles) {Rectangles = rectangles;}
    public void setText(String text) {Text = text;}

    public Logo(ArrayList<Circle> Circles, ArrayList<Rectangle> Rectangles, String Text){
        setCircle(Circles);
        setRectangle(Rectangles);
        setText(Text);
    }

    public double getArea(){
        double Area = 0;
        for (Circle circle : Circles)Area+=circle.getArea();
        for (Rectangle rectangle : Rectangles)Area+=rectangle.getArea();
        return Area;
    }
}
