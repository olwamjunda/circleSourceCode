package za.ac.application;

import za.ac.s211048321.Circle;

public class CircleApp {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();

        circle1.setRadius(3.4);
        circle1.setX(2.5);
        circle1.setY(1.3);

        circle2.setRadius(12.1);
        circle2.setX(5.0);
        circle2.setY(3.5);

        circle3.setRadius(3.0);
        circle3.setX(2.5);
        circle3.setY(7.4);

        System.out.println("The area of a circle with center at " +
                '(' + circle1.getX() + ',' +  circle1.getY() + ')' +" is " + circle1.calculateArea()
        +"m^2, the circumference is " + circle1.calculateCircumference() + "m^2 and the Diameter is " + circle1.calculateDiameter()
        +"m");

        System.out.println("The area of a circle with center at " +
                '(' + circle2.getX() + ',' +  circle2.getY() + ')' +" is " + circle2.calculateArea()
                +"m^2, the circumference is " + circle2.calculateCircumference() + "m^2 and the Diameter is " + circle2.calculateDiameter()
                +"m");

        System.out.println("The area of a circle with center at " +
                '(' + circle3.getX() + ',' +  circle3.getY() + ')' +" is " + circle3.calculateArea()
                +"m^2, the circumference is " + circle3.calculateCircumference() + "m^2 and the Diameter is " + circle3.calculateDiameter()
                +"m");



    }
}
