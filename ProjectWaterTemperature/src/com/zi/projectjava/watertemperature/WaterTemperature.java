package com.zi.projectjava.watertemperature;

import java.util.Scanner;

public class WaterTemperature {

    public static void main(String[] args) {
        // project IF: Water Form

        /* Directory */
        int T;

        /* Program */
        System.out.println("Example IF 3 Case");
        System.out.println("Temperature (der . C) = ");

        // Scanner
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt(); // input water temperature int

        // Process IF
        if (T < 0) {
            System.out.println("Water form is Frozen " + T);
        } else if ((0 <= T) && (T <= 100)) {
            System.out.println("Water form is Liquid " + T);
        } else if (T > 100) {
            System.out.println("Water form is Steam " + T);
        }
    }
}
