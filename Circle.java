package za.ac.s211048321;

import static java.lang.Math.PI;

public class Circle {
    private double radius;
    private double x;
    private double y;

    public double calculateArea(){
        return PI*radius*radius;
    }

    public double calculateCircumference(){
        return  2*PI*radius;
    }

    public  double calculateDiameter(){
        return 2*radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


}
