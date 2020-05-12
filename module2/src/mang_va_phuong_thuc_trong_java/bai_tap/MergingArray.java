package mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class MergingArray {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[3];
        int[] array3 = new int[8];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array1.length;i++){
            System.out.print("Enter element for array1 "+ (i+1)+" : ");
            array1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Array1: ");
        for (int j = 0; j < array1.length;j++){
            System.out.print(array1[j]+ "\t");
        }
        for (int i = 0; i < array2.length;i++){
            System.out.print("\n Enter element for array2 "+ (i+1)+" : ");
            array2[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Array2: ");
        for (int j = 0; j < array2.length;j++){
            System.out.print(array2[j]+ "\t");
        }
        for (int i = 0; i < array1.length;i++){
             array3[i] = array1[i];
        }
        for (int j = 0; j < array2.length;j++){
            array3[5+j]= array2[j];
        }
        System.out.print("\n Array3: ");
        for (int j = 0; j < array3.length;j++){
            System.out.print(array3[j]+ "\t");
        }
    }
}
