import edu.princeton.cs.introcs.StdDraw;

public class rectangle {
    private double length;
    private double width;

    public rectangle (double l, double w){
        length = l;
        width = w;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public double getArea(){
        return length*width;
    }

    public boolean ifSquare(){
        if (length == width){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean ifSmaller (rectangle a){
        double area1 = length*width;
        double area2 = a.getArea();
        return (area1<area2);
    }

    public void drawRectangle(){
        StdDraw. rectangle(0.2, 0.2, length/2, width/2);
    }


}
