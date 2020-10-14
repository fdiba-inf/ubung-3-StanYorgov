package exercise3;

public class NumberSearch {
    public static void main(String[] args) {
    
        int counter = 0;
        for (int num = 100; num <= 1000; num++ ) {
            if (num % 5 == 0 && num % 6 == 0) {        
                if (counter < 9) {
                  System.out.print(num + " ");

                } else if (counter == 9) {
                  System.out.println(num);

                } else {
                  counter = 0;
                  System.out.print(num + " ");
                } 
                counter++;
            } 
        }
    }
}