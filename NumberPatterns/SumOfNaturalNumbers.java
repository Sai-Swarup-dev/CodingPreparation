package NumberPatterns;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number till which you want the series: ");
        int number = scanner.nextInt(); //10
        int sum = 0;

        System.out.print("Natural Numbers are: ");
        if (number != 0) { //10 != 0
            for(int i=0; i<number; i++){ //i=0 to i<10 
                sum = sum + i;
                System.out.print(i+" "); //0 1 2 3 ....10
            }
            System.out.println();
            System.out.println("Sum of N natural number is: "+ sum);
        }

    }
}
