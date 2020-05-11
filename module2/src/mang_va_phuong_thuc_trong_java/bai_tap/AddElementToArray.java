package mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.print("Enter X: ");
        x = Integer.parseInt(scanner.nextLine());
        int index;
        System.out.print("Enter index of X: ");
        index = Integer.parseInt(scanner.nextLine());
        if (index <= 1 || index >= array.length - 1) {
            System.out.println("Không thể chèn vào mảng");
        } else {
            array[index] = x;
        }
        for (int value : array) {
            System.out.print(value + "\t");
        }
    }
}
