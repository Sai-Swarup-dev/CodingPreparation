package NumberPatterns;

import java.util.Scanner;

public class SumOfEvenNumbers {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N till which you want the series: ");
        int N = sc.nextInt();
        int sum = 0;

        System.out.print("Sum of Even Number Series: ");
        for(int i=1; i<N; i++){
            if(i%2 == 0){
                sum = sum + i;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.print("Sum of N Even Number is: "+ sum);
    }
}
