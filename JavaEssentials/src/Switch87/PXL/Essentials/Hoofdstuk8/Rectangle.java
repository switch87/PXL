package Switch87.PXL.Essentials.Hoofdstuk8;

/**
 * Created by gert on 4/04/2015.
 */
public class Rectangle {
    private int Height, Width, X, Y;
    private static int Count = 0;
    private static final int Angles = 4;

    public static int getCount(){
        return Count;
    }

    public static int getAngles(){
        return Angles;
    }

    public double getArea(){
        return Height*Width;
    }

    public double getPerimeter(){
        return 2*(Height+Width);
    }

    public void setHeight(int height){
        Height = height<0?-height:height;
    }

    public void setWidth(int width){
        Width=width<0?-width:width;
    }

    public void setPosition(int x, int y){
        X=x;
        Y=y;
    }

    public void setX(int x){
        X=x<0?-x:x;
    }

    public void setY(int y){
        Y=y<0?-y:y;
    }

    public int getX(){
        return X;
    }

    public int getY(){
        return Y;
    }

    public int getHeight(){
        return Height;
    }

    public int getWidth(){
        return Width;
    }

    public void grow(int d){grow(d,d);}

    public void grow(int growH, int growW){
        Height+=(growH<-Height?-Height:growH);
        Width+=(growW<-Width?-Width:growW);
    }

    public Rectangle (int Height, int Width, int X, int Y){
        setHeight(Height);
        setWidth(Width);
        setPosition(X, Y);
        Count++;
    }

    public Rectangle(int Height, int Width){
        this(Height,Width,0,0);
    }

    public  Rectangle(){
        this(0,0,0,0);
    }

    public Rectangle(Rectangle Other){
        this(Other.getHeight(),Other.getWidth(),Other.getX(),Other.getY());
    }
}
