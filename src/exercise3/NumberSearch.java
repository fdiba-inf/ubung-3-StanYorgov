package exercise3;

public class NumberSearch {
    public static void main(String[] args) {
    
        int counter = 0;
        for (int num = 100; num <= 1000; num++ ) {
            if (num % 5 == 0 && num % 6 == 0) {        
                if (counter < 9) {
                  counter++;
                  System.out.print(num + " ");
                } else if (counter == 8) {
                  counter++;
                  System.out.print(num);
                } else {
                  counter = 0;
                  System.out.println(num + " ");
                }
        
            } 
        }
    }
}