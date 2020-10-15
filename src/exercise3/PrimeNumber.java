package exercise3;

import java.util.Scanner;

public class PrimeNumber {  
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        boolean primeNum = true;

        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
              primeNum = false;
              break;
            }
        } 

        System.out.println("Prime number: " + primeNum);
    }
}