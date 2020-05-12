package mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class CountsTheNumberOfOccurrencesOfAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Character character = 'c';
        int count = 0;
        System.out.print("Enter string: ");
        String name = scanner.nextLine();
        for (int i = 0; i < name.length();i++){
            if (name.charAt(i) == character){
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự "+ character+ " trong chuỗi "+name+" là: "+ count);
    }
}
