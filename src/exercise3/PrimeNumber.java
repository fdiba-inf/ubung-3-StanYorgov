package exercise3;

import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int number = input.nextInt();
    int d = 2;
    boolean primeNum = true;

    if (number > 2) {
      while (d < number) {
        if (number % d == 0) {
          primeNum = false;
          System.out.println("Prime number: " + primeNum);
          return;
        } else {
          d++;
        }
      }    
    } else {
        return;
    } 
    System.out.println("Prime number: " + primeNum);
  }
}