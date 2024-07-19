package NumberDesign;

import java.util.Scanner;

/**
 * SquareStarPattern
 */
public class SquareStarPattern {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of col and row: ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        System.out.println("Col: "+col+", row: "+row);

        //logic
        for(int i=0; i<col; i++){
            for (int j=0; j<row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}