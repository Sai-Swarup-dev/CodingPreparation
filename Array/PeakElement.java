package Array;

//Input: array[]= {10, 20, 15, 2, 23, 90, 67}
//Output: 20 or 90

import java.util.Scanner;

public class PeakElement {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        for(int i=1; i<n-1; i++){
            if(a[i] > a[i-1] && a[i] > a[i+1]){
                System.out.println("Peak element is: " + a[i]);
                return;
            }
        }

        // Check if the first or last element is the peak
        if(a[0] > a[1]){
            System.out.println("Peak element is: " + a[0]);
            return;
        }

        if(a[n-1] > a[n-2]){
            System.out.println("Peak element is: " + a[n-1]);
            return;
        }
    }
}