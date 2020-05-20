package ss1_ngon_ngu_lap_trinh_java.bai_tap;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args){
        int numbers = 20;
        int count = 0;
        int N = 2;
        while (count < numbers){
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(N);i++){
                if (N % i == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
}
