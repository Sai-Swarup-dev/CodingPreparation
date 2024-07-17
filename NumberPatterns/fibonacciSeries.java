package NumberPatterns;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        int endNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number till which you want the series: ");
        endNumber = scanner.nextInt();
    
        for(int i=0; i<endNumber; i++){
            if(i==0){
                System.out.print(a +" ");
            }else if (i == 1) {
                System.out.print(b +" ");
            }else{
                c = a+b;
                a = b;
                b = c;
                System.out.print(c+" ");
            }
        }
    }
    
}


/* NOTE:
 * =====
 * Fibonacci Series:
 * 0 1 1 2 3 5 8 ......
 */