package Switch87.PXL.Essentials.Hoofdstuk8;

/**
 * Created by gert on 4/04/2015.
 */
public class Circle {

    private int X, Y, Radius;
    private static final int Angles = 0;
    private static int Count = 0;

    public int getX(){return X;}
    public void setX(int X){this.X=X;}
    public int getY(){return Y;}
    public void setY(int Y){this.Y=Y;}
    public void serPosition(int X, int Y){this.setX(X);this.setY(Y);}
    public int getRadius(){return Radius;}
    public void setRadius(int Radius){this.Radius=Radius<0?-Radius:Radius;}
    public static int getAngles() {return Angles;}
    public static int getCount() {return Count;}
    public void setPosition(int X, int Y){setX(X);setY(Y);}
    public double getArea(){return Math.PI*getRadius()*getRadius();}
    public double getPerimeter(){return 2*Math.PI*getRadius();}
    public void grow(int d){setRadius(getRadius()+Math.abs(d));}

    public Circle(int Radius, int X, int Y){
        setRadius(Radius);
        setX(X);
        setY(Y);
        Count++;
    }
    public Circle(int Radius){this(Radius,0,0);}
    public Circle(Circle Other){this(Other.getRadius(),Other.getX(),Other.getY());}
    public Circle(){this(0,0,0);}




}
