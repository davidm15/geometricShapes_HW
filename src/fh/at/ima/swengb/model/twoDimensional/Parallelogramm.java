package fh.at.ima.swengb.model.twoDimensional;

import fh.at.ima.swengb.model.GeometricShapes;

/**
 * Created by David on 09.11.2016.
 */
public class Parallelogramm extends TwoDim {

    public Parallelogramm(double x, double y, double h) {

        this.x = x;
        this.y = y;
        this.h = h;

    }


    @Override
    public double calculateArea() {
        return h * x;
    }

    @Override
    public double calculatePerimeter() {
        return y*2 + x*2;
    }
    @Override
    public String toString() {
        return x + "," + y + "," + h;
    }
    @Override
    public double calculateVolume() {
        return 0;
    }

    @Override
    public double calculateSurfaceArea() {
        return 0;
    }

}
