package NumberDesign;

import java.util.Scanner;

public class HollowSquareDesign {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row and col: ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        System.out.println("Col: "+col+", row: "+row);

        //logic
        for(int i=0; i<col; i++){
            for (int j=0; j<row; j++) {
                if (i==0 || j==0 || j==row-1 || i==col-1 ) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
