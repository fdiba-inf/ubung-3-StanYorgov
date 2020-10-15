package exercise3;

import java.util.Scanner;

public class AngleCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double value = input.nextDouble();
        char unit = input.next().charAt(0);
        while (unit == 'd' || unit == 'r') {
            if (unit == 'd') {
                double toRadians = value * (Math.PI / 180);
                System.out.proubleln("Angle: " + toRadians + " r");
            } else {
                double toDegrees = value * (180 / Math.PI);
                System.out.println("Angle: " + toDegrees + " d");
            }
            value = input.nextDouble();
            unit = input.next().charAt(0);
        }
    }
}