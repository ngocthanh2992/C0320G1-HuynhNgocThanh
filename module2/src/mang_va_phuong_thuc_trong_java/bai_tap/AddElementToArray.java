package mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        int[] array1 = new int[11];
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.print("Enter X: ");
        x = Integer.parseInt(scanner.nextLine());
        int index;
        System.out.print("Enter index of X: ");
        index = Integer.parseInt(scanner.nextLine());
        if (index < 1 || index >= array.length - 1) {
            System.out.println("Không thể chèn vào mảng");
        } else {
            array1[index] = x;
            for (int i =0;i< index;i++){
                array1[i] = array[i];
            }
            for (int i = array.length-1;i >= index; i--){
                array1[i+1] = array[i];
            }
        }
        for (int value : array1) {
            System.out.print(value + "\t");
        }
    }
}
