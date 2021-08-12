package com.zi.project.dimentionalfigure;

public class RightTriangle implements PlaneFigure {

    RightTriangle() {

    }

    @Override
    public double area(int s1, int s2) {
        return (0.5 * s1 * s2);
    }

    @Override
    public double perimeter(int s1, int s2) {
        return (s1 + s2 + Math.sqrt((s1 * s1) +(s2 * s2)));
    }
}
