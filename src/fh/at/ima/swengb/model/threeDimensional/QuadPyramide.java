package fh.at.ima.swengb.model.threeDimensional;

/**
 * Created by David on 09.11.2016.
 */
public class QuadPyramide extends ThreeDim {

    public QuadPyramide(double x, double h) {
        this.x = x;
        this.h = h;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateVolume() {
        double ha = Math.sqrt((x/2)*(x/2)+h*h);
        return 1/3*x*x*h;
    }

    @Override
    public double calculateSurfaceArea() {
        double ha = Math.sqrt((x/2)*(x/2)+h*h);
        return x*x+4*(x*ha/2);
    }
}
