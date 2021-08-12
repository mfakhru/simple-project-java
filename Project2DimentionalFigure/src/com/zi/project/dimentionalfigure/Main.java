package com.zi.project.dimentionalfigure;

import java.util.Scanner;

public class Main {

    private static char choice;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        /* Directory */
        Rectangle orectangle;
        RightTriangle otriangle;
        Circle ocircle;
        int s1, s2, r;

        orectangle = new Rectangle();
        otriangle = new RightTriangle();
        ocircle = new Circle();

        /* Program */
        // calling method
        mainMenu();

        // switch
        switch(choice) {
            case '1' : {
                System.out.print("Enter length rectangle : ");
                s1 = scanner.nextInt();
                System.out.print("Enter widht rectangle : ");
                s2 = scanner.nextInt();
                System.out.println("Area of rectangle : " + orectangle.area(s1,s2));
                System.out.println("Perimeter of rectangle : " + orectangle.perimeter(s1,s2));
                break;
            }
            case '2' : {
                System.out.print("Enter base triangle : ");
                s1 = scanner.nextInt();
                System.out.print("Enter height triangle : ");
                s2 = scanner.nextInt();
                System.out.println("Area of triangle : " + otriangle.area(s1,s2));
                System.out.println("Perimeter of triangle : " + otriangle.perimeter(s1,s2));
                break;
            }
            case '3' : {
                System.out.print("Enter radius your circle : ");
                r = scanner.nextInt();
                System.out.println("Area of circle : " + ocircle.area(r));
                System.out.println("Perimeter of circle : " + ocircle.perimeter(r));
                break;
            }
            default:{
                System.out.println("No choice");
                break;
            }
        }
    }

    private static void mainMenu() {
        // choice menu
        System.out.println("===========");
        System.out.println("Calculate Area and Perimeter");
        System.out.println("1. Rectangle");
        System.out.println("2. Right Triangle");
        System.out.println("3. Circle");
        System.out.println("Enter menu : ");
        choice = scanner.next().charAt(0);
    }
}
