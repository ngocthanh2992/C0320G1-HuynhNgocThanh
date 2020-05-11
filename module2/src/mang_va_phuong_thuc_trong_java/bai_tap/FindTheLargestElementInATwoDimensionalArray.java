package mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class FindTheLargestElementInATwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1;
        System.out.print("Nhập row: ");
        size1 = scanner.nextInt();
        int size2;
        System.out.print("Nhập column: ");
        size2 = scanner.nextInt();
        int[][] matrix = new int[size1][size2];
        System.out.println("Enter "+ matrix.length+ " rows and "+ matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length;row++){
            for (int column = 0; column <matrix[row].length; column++){
                System.out.println("Phần tử "+ row+" "+column);
                matrix[row][column]=scanner.nextInt();
            }
        }
        for (int row = 0; row < matrix.length;row++){
            for (int column = 0; column<matrix[row].length; column++){
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println();
        }
        int max = matrix[0][0];
        int row1 = 0;
        int column1 = 0;
        for (int row = 0;row < matrix.length;row++){
            for (int column = 0; column< matrix[row].length;column++){
                if (matrix[row][column] > max){
                    max = matrix[row][column];
                    row1 = row;
                    column1 = column;
                }
            }
        }
        System.out.println("Max is: "+ max + " at position "+ "["+row1+"]" +" "+ "["+column1+"]");
    }
}
