package ss2_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class SumTheNumbersInAGivenColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1;
        System.out.print("Enter row: ");
        size1 = Integer.parseInt(scanner.nextLine());
        int size2;
        System.out.print("Enter column: ");
        size2 = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size1][size2];
        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                System.out.println("Phần tử " + row + " " + column);
                matrix[row][column] = scanner.nextInt();
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        System.out.print("Enter a column to sum: ");
        int order = scanner.nextInt();
        int total = 0;
        for (int row = 0; row < matrix.length; row++) {
            total += matrix[row][order];
        }
        System.out.println("Sum of a column " + order + " is " + total);
    }
}

