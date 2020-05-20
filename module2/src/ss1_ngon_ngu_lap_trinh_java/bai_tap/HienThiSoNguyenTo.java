package ss1_ngon_ngu_lap_trinh_java.bai_tap;

public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        int number = 2;
       while (number <100){
           boolean check = true;
           for (int i =2 ;i <= Math.sqrt(number);i++){
               if (number % i == 0){
                   check = false;
                   break;
               }
           }
           if (check){
               System.out.println(number);
           }
           number++;
       }
    }
}
