import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int row = input.nextInt();
        System.out.print("Enter the number of column: ");
        int column = input.nextInt();

        int[][] matrix1 = new int[row][column];
        System.out.println("Enter the values for the first matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }

        int[][] matrix2 = new int[row][column];
        System.out.println("Enter the values for the second matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }

        int[][] sum = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("The sum of the matrices is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
