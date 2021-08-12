package com.zi.project.dimentionalfigure;

public class Rectangle implements PlaneFigure {

    Rectangle() {

    }

    @Override
    public double area(int s1, int s2) {
        return (s1 * s2);
    }

    @Override
    public double perimeter(int s1, int s2) {
        return (2 * (s1 + s2));
    }
}
