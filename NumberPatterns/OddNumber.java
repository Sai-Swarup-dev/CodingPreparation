package NumberPatterns;

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the N to get the series: ");
        int n = scanner.nextInt();

        System.out.print("Odd Number Series: ");
        for(int i=1; i<n; i++){
            if(i%2 != 0){
                System.out.print(i+" ");
            }
        }
    }
}
