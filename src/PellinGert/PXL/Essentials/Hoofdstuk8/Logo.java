package PellinGert.PXL.Essentials.Hoofdstuk8;

/**
 * Created by gert on 4/04/2015.
 */
public class Logo {
    private Circle Circle;
    private Rectangle Rectangle;
    private String Text;

    public PellinGert.PXL.Essentials.Hoofdstuk8.Circle getCircle() {
        return Circle;
    }

    public PellinGert.PXL.Essentials.Hoofdstuk8.Rectangle getRectangle() {
        return Rectangle;
    }

    public String getText() {
        return Text;
    }

    public void setCircle(PellinGert.PXL.Essentials.Hoofdstuk8.Circle circle) {
        Circle = circle;
    }

    public void setRectangle(PellinGert.PXL.Essentials.Hoofdstuk8.Rectangle rectangle) {
        Rectangle = rectangle;
    }

    public void setText(String text) {
        Text = text;
    }

    public Logo(Circle Circle, Rectangle Rectangle, String Text){setCircle(Circle);setRectangle(Rectangle);setText(Text);}

    public double getArea(){return Circle.getArea()+Rectangle.getArea();}
}
