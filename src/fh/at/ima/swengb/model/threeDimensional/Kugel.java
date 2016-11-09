package fh.at.ima.swengb.model.threeDimensional;

/**
 * Created by David on 09.11.2016.
 */
public class Kugel extends ThreeDim {

    public Kugel(double x) {
        this.x = x;

    }

    @Override
    public double calculateSurfaceArea() {
        return 4*Math.PI*x*x;
    }

    @Override
    public double calculateVolume() {
        return 4/3*Math.PI*x*x*x;
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
