package mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class FindTheSmallestValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        System.out.print("Enter size of array: ");
        size = Integer.parseInt(scanner.nextLine());
        array = new int[size];
        for (int i =0; i < array.length;i++){
            System.out.print("Enter elements " + (i+1)+ " : ");
            array[i]= Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Array: ");
        for (int j = 0; j < array.length;j++){
            System.out.print(array[j] + "\t");
        }
        int min = array[0];
        for (int i = 0; i < array.length;i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.print("The Smallest value in array is "+min);
    }
}
