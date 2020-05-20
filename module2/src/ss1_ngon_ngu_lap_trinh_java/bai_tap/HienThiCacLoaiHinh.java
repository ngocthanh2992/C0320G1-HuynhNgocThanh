package ss1_ngon_ngu_lap_trinh_java.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle(4 different angles: top-left, top-right, bottom-left, bottom-right");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        while (true) {
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle bottom-left");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("Print the square triangle top-left ");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("Print the square triangle bottom-right");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j <= 3 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int z = 5; z >= 5 - i; z--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("Print the square triangle top-right");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 3; j > 3 - i; j--) {
                            System.out.print(" ");
                        }
                        for (int z = 0; z < 5 - i; z++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Print the isosceles triangle");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 5 - i; j > 0; j--) {
                            System.out.print(" ");
                        }
                        for (int z = 0; z <= i; z++) {
                            System.out.print("*");
                        }
                        for (int x = 1; x <= i; x++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice");
            }
        }
    }
}
