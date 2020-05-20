package ss2_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TestTriangleException {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập cạnh a: ");
            int a;
            a = Integer.parseInt(scanner.nextLine());
            int b;
            System.out.println("Nhập cạnh b: ");
            b = Integer.parseInt(scanner.nextLine());
            int c;
            System.out.println("Nhập cạnh c: ");
            c = Integer.parseInt(scanner.nextLine());
            if (a < 0 && b < 0 && c < 0 || (a + b) < c || (a + c) < b || (b + c) < a) throw new IllegalTriangleException("Không được nhập vào số âm và tổng 2 cạnh phải lớn hơn cạnh còn lại");
        }catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }
    }
}
