package NumberPatterns;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N to find the factorial: ");
        int num = scanner.nextInt();
        int fact = 1;

        if(num != 0){
            for (int i = 1; i<=num; i++) {
                fact = fact * i;  
            }
        }
        System.out.println("Factorial of "+ num + " is: "+ fact);
    }
}
