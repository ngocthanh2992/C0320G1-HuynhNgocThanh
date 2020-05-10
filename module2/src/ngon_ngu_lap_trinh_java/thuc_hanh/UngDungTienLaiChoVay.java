package ngon_ngu_lap_trinh_java.thuc_hanh;

import java.util.Scanner;

public class UngDungTienLaiChoVay {
    public static void main(String[] args){
        double money = 0;
        int month = 1;
        double interset_rate = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter investment amout: ");
        money = sc.nextDouble();
        System.out.println("Enter numbers of month: ");
        month   = sc.nextInt();
        System.out.println("Enter annual intersest: ");
        interset_rate = sc.nextDouble();
        double total_interset = 0;
        for (int i =0; i < month;i++){
            total_interset = money * (interset_rate/100)/12* month;
        }
        System.out.println("Total of interest:" + total_interset);
    }
}
