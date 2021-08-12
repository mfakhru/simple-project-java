package com.zi.project.dimentionalfigure;

public class Circle implements PlaneFigure {

    private double pi = 3.14;

    Circle(){

    }

    @Override
    public double area(int s1, int s2) {
        return 0;
    }

    @Override
    public double perimeter(int s1, int s2) {
        return 0;
    }

    public double area(int r) { // method overload
        return (pi * r * r);
    }

    public double perimeter(int r) {
        return (2 * pi * r);
    }
}
