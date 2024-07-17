package NumberPatterns;

import java.util.Scanner;

public class fibonacciSeriesUsingRecerssion {
    public static void main(String[] args) {
        int number;
        int firstNum = 0;
        int secondNum = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = scanner.nextInt();
        fibonnacSeriesUsingRecurssion(number, firstNum, secondNum);
    }
    private static void fibonnacSeriesUsingRecurssion(int number, int firstNum, int secondNum) {
        if(number>0){
            System.out.print(firstNum+" ");
            fibonnacSeriesUsingRecurssion(number-1, secondNum, firstNum+secondNum);
        }
    }
}
