package PellinGert.PXL.Essentials.Hoofdstuk8;

/**
 * Created by gert on 4/04/2015.
 */
public class Rectangle {
    private int Height, Width, X, Y;

    public int getArea(){
        return Height*Width;
    }

    public int getPerimeter(){
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

    public void grow(int growH, int growW){
        Height+=(growH<-Height?-Height:growH);
        Width+=(growW<-Width?-Width:growW);
    }
}
