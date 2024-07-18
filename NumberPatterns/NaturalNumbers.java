package NumberPatterns;

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number till which you want the series: ");
        int number = scanner.nextInt(); //10

        System.out.println("Natural Numbers are: ");
        if (number != 0) { //10 != 0
            for(int i=0; i<number; i++){ //i=0 to i<10 
                System.out.print(i+" "); //0 1 2 3 ....10
            }
        }

    }
}
