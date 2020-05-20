package ss1_ngon_ngu_lap_trinh_java.bai_tap;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = Integer.parseInt(sc.nextLine());
        if (number <= 10 && number >= 0) {
            switch (number) {
                case 0:
                    System.out.print("Zero");
                    break;
                case 1:
                    System.out.print("One");
                    break;
                case 2:
                    System.out.print("Two");
                    break;
                case 3:
                    System.out.print("Three");
                    break;
                case 4:
                    System.out.print("Four");
                    break;
                case 5:
                    System.out.print("Five");
                    break;
                case 6:
                    System.out.print("Six");
                    break;
                case 7:
                    System.out.print("Seven");
                    break;
                case 8:
                    System.out.print("Eight");
                    break;
                case 9:
                    System.out.print("Nine");
                    break;
                case 10:
                    System.out.print("Ten");
                    break;
            }
        } else if (number <= 20 && number > 10) {
            switch (number) {
                case 11:
                    System.out.print("Eleven");
                    break;
                case 12:
                    System.out.print("Twelve");
                    break;
                case 13:
                    System.out.print("Thirteen");
                    break;
                case 14:
                    System.out.print("Fourteen");
                    break;
                case 15:
                    System.out.print("Fifteen");
                    break;
                case 16:
                    System.out.print("Sixteen");
                    break;
                case 17:
                    System.out.print("Seventeen");
                    break;
                case 18:
                    System.out.print("Eighteen");
                    break;
                case 19:
                    System.out.print("Nineteen");
                    break;
                case 20:
                    System.out.print("Twenty");
                    break;
            }
        } else if (number > 20 && number < 100) {
            switch (number / 10) {
                case 3:
                    System.out.print("Thirty");
                    break;
                case 4:
                    System.out.print("Forty");
                    break;
                case 5:
                    System.out.print("Fifty");
                    break;
                case 6:
                    System.out.print("Sixty");
                    break;
                case 7:
                    System.out.print("Seventy");
                    break;
                case 8:
                    System.out.print("Eighty");
                    break;
                case 9:
                    System.out.print("Ninety");
                    break;
            }
            switch (number % 10) {
                case 1:
                    System.out.print(" one");
                    break;
                case 2:
                    System.out.print(" two");
                    break;
                case 3:
                    System.out.print(" three");
                    break;
                case 4:
                    System.out.print(" four");
                    break;
                case 5:
                    System.out.print(" five");
                    break;
                case 6:
                    System.out.print(" six");
                    break;
                case 7:
                    System.out.print(" seven");
                    break;
                case 8:
                    System.out.print(" eight");
                    break;
                case 9:
                    System.out.print(" nine");
                    break;
            }
        } else if (number >= 100 && number < 1000) {
            switch (number / 100) {
                case 1:
                    System.out.print("One hundred");
                    break;
                case 2:
                    System.out.print("Two hundred");
                    break;
                case 3:
                    System.out.print("Three hundred");
                    break;
                case 4:
                    System.out.print("Four hundred");
                    break;
                case 5:
                    System.out.print("Five hundred");
                    break;
                case 6:
                    System.out.print("Six hundred");
                    break;
                case 7:
                    System.out.print("Seven hundred");
                    break;
                case 8:
                    System.out.print("Eight hundred");
                    break;
                case 9:
                    System.out.print("Nine hundred");
                    break;
            }
            switch (number % 100) {
                case 1:
                    System.out.print(" and one");
                    break;
                case 2:
                    System.out.print(" and two");
                    break;
                case 3:
                    System.out.print(" and three");
                    break;
                case 4:
                    System.out.print(" and four");
                    break;
                case 5:
                    System.out.print(" and five");
                    break;
                case 6:
                    System.out.print(" and six");
                    break;
                case 7:
                    System.out.print(" and seven");
                    break;
                case 8:
                    System.out.print(" and eight");
                    break;
                case 9:
                    System.out.print(" and nine");
                    break;
                case 10:
                    System.out.print(" and ten");
                    break;
                case 11:
                    System.out.print(" and eleven");
                    break;
                case 12:
                    System.out.print(" and twelve");
                    break;
                case 13:
                    System.out.print(" and thirteen");
                    break;
                case 14:
                    System.out.print(" and fourteen");
                    break;
                case 15:
                    System.out.print(" and fifteen");
                    break;
                case 16:
                    System.out.print(" and sixteen");
                    break;
                case 17:
                    System.out.print(" and seventeen");
                    break;
                case 18:
                    System.out.print(" and eighteen");
                    break;
                case 19:
                    System.out.print(" and nineteen");
                    break;
            }
            switch ((number % 100) / 10) {
                case 2:
                    System.out.print(" and twenty");
                    break;
                case 3:
                    System.out.print(" and thirty");
                    break;
                case 4:
                    System.out.print(" and forty");
                    break;
                case 5:
                    System.out.print(" and fifty");
                    break;
                case 6:
                    System.out.print(" and sixty");
                    break;
                case 7:
                    System.out.print(" and seventy");
                    break;
                case 8:
                    System.out.print(" and eighty");
                    break;
                case 9:
                    System.out.print(" and ninety");
                    break;
            }
            switch ((number % 100) % 10) {
                case 1:
                    System.out.print("-one");
                    break;
                case 2:
                    System.out.print("-two");
                    break;
                case 3:
                    System.out.print("-three");
                    break;
                case 4:
                    System.out.print("-four");
                    break;
                case 5:
                    System.out.print("-five");
                    break;
                case 6:
                    System.out.print("-six");
                    break;
                case 7:
                    System.out.print("-seven");
                    break;
                case 8:
                    System.out.print("-eight");
                    break;
                case 9:
                    System.out.print("-nine");
                    break;
            }
        }else {
            System.out.print("No support!");
        }
    }
}