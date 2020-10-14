package exercise3;

import java.util.Scanner;

public class NumberCounter {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
    
        int number = input.nextInt();
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        double sum = 0;
        double counter = 0;
        double Avarage = 0;
    
        while (number != 0) {
          if (number > 0) {
            positiveNumbers++;
          } else {
            negativeNumbers++;
          }
          counter++;
          sum = sum + number;
          Avarage = sum / counter;
          //System.out.println("Positive numbers: " + positiveNumbers);
          //System.out.println("Negative numbers: " + negativeNumbers);
          //System.out.println("Sum: " + sum);
          //System.out.println("Avarage: " + Avarage);
          number = input.nextInt();
        }
          System.out.println("Positive numbers: " + positiveNumbers);
          System.out.println("Negative numbers: " + negativeNumbers);
          System.out.println("Sum: " + sum);
          System.out.println("Avarage: " + Avarage);
    }
}