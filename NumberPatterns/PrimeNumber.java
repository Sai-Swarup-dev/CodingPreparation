package NumberPatterns;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int c = 0;

        for(int i=1; i<=n; i++){
            if(n%i == 0){
                c++;
            }
        }

        System.out.println("count: "+ c);
        if (c == 2) {
            System.out.println(n +" is a Prime Number");
        }else{
            System.out.println(n +" is not a Prime Number");
        }
    }
}
