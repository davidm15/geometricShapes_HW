package fh.at.ima.swengb.model.threeDimensional;

/**
 * Created by David on 09.11.2016.
 */
public class Zylinder extends ThreeDim {

    public Zylinder(double x, double h) {
        this.x = x;
        this.h = h;
    }

    @Override
    public double calculateVolume() {
        return Math.PI*x*x*h;
    }

    @Override
    public double calculateSurfaceArea() {
        return 2*Math.PI*x*(x+h);
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }
}
