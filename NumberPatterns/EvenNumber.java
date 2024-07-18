package NumberPatterns;

import java.util.Scanner;

public class EvenNumber {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N till which you want the series: ");
        int N = sc.nextInt();

        System.out.print("Even Number Series: ");
        for(int i=1; i<N; i++){
            if(i%2 == 0){
                System.out.print(i+" ");
            }
        }
    }
}
