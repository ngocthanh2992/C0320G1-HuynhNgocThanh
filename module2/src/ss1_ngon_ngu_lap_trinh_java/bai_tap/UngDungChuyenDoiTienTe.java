package ss1_ngon_ngu_lap_trinh_java.bai_tap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args){
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tiền USD: ");
        usd = sc.nextDouble();
        double quydoi = usd * vnd;
        System.out.println("Giá trị VND: "+ quydoi);
    }
}
