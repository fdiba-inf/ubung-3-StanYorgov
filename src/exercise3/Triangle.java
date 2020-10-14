package exercise3;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double a = input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();

        do {
            if (a < (b + c) && b < (a + c) && c < (a + b)) {
                if (a == b && b == c) {                    
                    double s = (a + b + c)/2;
                    double S = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                    System.out.println("Area: " + S);
                    System.out.println("Triangle: equilateral");

                } else if(a == b || a == c || b == c) {
                    double s = (a + b + c)/2;
                    double S = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                    System.out.println("Area: " + S);
                    System.out.println("Triangle: isosceles");

                } else {
                    double s = (a + b + c)/2;
                    double S = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                    System.out.println("Area: " + S);
                    System.out.println("Triangle: scalene");
                }
            } else {
                System.out.println("Values are not correct!");
            }
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();

        } while ( a > 0 && b > 0 && c > 0);        
    }
}