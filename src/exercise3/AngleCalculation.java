package exercise3;

import java.util.Scanner;

public class AngleCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double value = input.nextInt();
        char unit = input.next().charAt(0);
        while (unit == 'd' || unit == 'r') {
            if (unit == 'd') {
                double toRadians = unit * (Math.PI / 180);
                System.out.println("Angle: " + toRadians + " r");
            } else {
                double toDegrees = unit * (180 / Math.PI);
                System.out.println("Angle: " + toDegrees + " d");
            }
            value = input.nextInt();
            unit = input.next().charAt(0);
        }
    }
}