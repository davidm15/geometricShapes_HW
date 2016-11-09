package fh.at.ima.swengb.model.twoDimensional;

/**
 * Created by David on 09.11.2016.
 */
public class Trapez extends TwoDim {

    //When you look at the flachf.pdf you will see that the Trapez has a "b" and a "d" side. They are calculated
    //automatically in my code.
    public Trapez(double x, double y, double h) {
        this.x = x;
        this.y = y;
        this.h = h;
    }

    @Override
    public double calculateArea() {
        return (x+y)/2*h;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }

    @Override
    public double calculateSurfaceArea() {
        return 0;
    }

    //This function also calculates the perimeter when the Trapez is upside down.
    @Override
    public double calculatePerimeter() {
        if (x < y) {
            double l = (y-x)/2;
            double b = Math.sqrt(h*h + l*l);
            return b*2 + x + y;
        } else {
            double l = (x-y)/2;
            double b = Math.sqrt(h*h + l*l);
            return b*2 + x + y;
        }

    }
}
