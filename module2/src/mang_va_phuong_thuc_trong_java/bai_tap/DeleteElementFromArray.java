package mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class DeleteElementFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {10,4,6,7,8,6,0,0,0,0};
        int x;
        int index_del=0;
        boolean check = false;
        System.out.print("Enter a number to delete: ");
        x = Integer.parseInt(scanner.nextLine());
        System.out.print("Original Array: ");
        for (int i = 0; i <array.length;i++){
            System.out.print(array[i]+"\t");
        }
        for (int i = 0; i < array.length; i++){
            if (x == array[i]){
                index_del = i;
                check = true;
            }
        }
        if (check){
            for (int j = index_del; j < array.length-1;j++){
                array[j] = array[j +1];
            }
            System.out.print("Current Array: ");
            for (int i = 0; i <array.length;i++){
                System.out.print(array[i]+"\t");
            }
        }else {
            System.out.print("\n"+ x + " is not in array");
        }
    }
}
