package fh.at.ima.swengb.model.twoDimensional;

/**
 * Created by David on 09.11.2016.
 */
public class Dreieck extends TwoDim {

    //x,y,z behaves like a,b,c
    public Dreieck(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public double calculateArea() {
        double p = (x+y+z)/2;
        return Math.sqrt(p*(p-x)*(p-y)*(p-z));
        //Heron's formula => no height needed.
    }

    @Override
    public double calculatePerimeter() {
        return x+y+z;
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
