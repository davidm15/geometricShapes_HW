package fh.at.ima.swengb;

import fh.at.ima.swengb.model.GeometricShapes;
import fh.at.ima.swengb.model.threeDimensional.Kugel;
import fh.at.ima.swengb.model.threeDimensional.QuadPyramide;
import fh.at.ima.swengb.model.threeDimensional.Zylinder;
import fh.at.ima.swengb.model.twoDimensional.Trapez;
import fh.at.ima.swengb.model.twoDimensional.Parallelogramm;
import fh.at.ima.swengb.model.twoDimensional.Dreieck;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by David on 09.11.2016.
 */
public class Main {

    public static void main(String[] args) {

        Main main = new Main();

        main.doIt();

    }

    private void doIt() {
        List<Double> twoDimList = new ArrayList<>();
        List<Double> threeDimList = new ArrayList<>();

        fillList2D(twoDimList);
        fillList3D(threeDimList);
        printList2D(twoDimList,threeDimList);

    }

    private void fillList3D(List<Double> threeDimList) {

        threeDimList.add(new Kugel(15).calculateVolume());
        threeDimList.add(new Kugel(15).calculateSurfaceArea());

        threeDimList.add(new Kugel(30).calculateVolume());
        threeDimList.add(new Kugel(30).calculateSurfaceArea());

        threeDimList.add(new QuadPyramide(5,10).calculateVolume());
        threeDimList.add(new QuadPyramide(5,10).calculateSurfaceArea());

        threeDimList.add(new QuadPyramide(7,3).calculateVolume());
        threeDimList.add(new QuadPyramide(7,3).calculateSurfaceArea());

        threeDimList.add(new Zylinder(3,13).calculateVolume());
        threeDimList.add(new Zylinder(3,13).calculateSurfaceArea());

        threeDimList.add(new Zylinder(2,18).calculateVolume());
        threeDimList.add(new Zylinder(2,18).calculateSurfaceArea());

    }


    private void fillList2D(List<Double> twoDimList) {

        twoDimList.add(new Parallelogramm(4,5,6).calculateArea());
        twoDimList.add(new Parallelogramm(4,5,6).calculatePerimeter());

        twoDimList.add(new Parallelogramm(7,8,9).calculateArea());
        twoDimList.add(new Parallelogramm(7,8,9).calculatePerimeter());

        twoDimList.add(new Dreieck(4,5,6).calculateArea());
        twoDimList.add(new Dreieck(4,5,6).calculatePerimeter());

        twoDimList.add(new Dreieck(7,8,9).calculateArea());
        twoDimList.add(new Dreieck(7,8,9).calculatePerimeter());

        twoDimList.add(new Trapez(4,5,6).calculateArea());
        twoDimList.add(new Trapez(4,5,6).calculatePerimeter());

        twoDimList.add(new Trapez(3,2,6).calculateArea());
        twoDimList.add(new Trapez(3,2,6).calculatePerimeter());


    }

    private void printList2D(List<Double> twoDimList,List<Double> threeDimList) {

        double result = twoDimList.stream().reduce(0.0, Double::sum);
        System.out.println("This is the sum of 2-dimensional shapes:\n" + result);
        System.out.println("\n");
        double result2 = threeDimList.stream().reduce(0.0, Double::sum);
        System.out.println("This is the sum of 3-dimensional shapes:\n" + result2);
    }

}
