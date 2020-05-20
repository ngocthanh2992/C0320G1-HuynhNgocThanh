package ss1_ngon_ngu_lap_trinh_java.thuc_hanh;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double weight,height,bmi;
        System.out.print("Your weight(kg): ");
        weight = sc.nextDouble();
        System.out.print("Your height (m): ");
        height = sc.nextDouble();
        bmi = weight/Math.pow(height,2);
        System.out.printf("%-20s%s","bmi","Interpretation\n");
        if (bmi<18){
            System.out.printf("%-20s%s",bmi,"Underweight");
        } else if (bmi<25.0){
            System.out.printf("%-20s%s",bmi,"Normal");
        }else if (bmi<30.0){
            System.out.printf("%-20s%s",bmi,"Overweight");
        }else {
            System.out.printf("%-20s%s",bmi,"Obese");
        }
    }
}
