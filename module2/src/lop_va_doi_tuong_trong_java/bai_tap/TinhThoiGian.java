package lop_va_doi_tuong_trong_java.bai_tap;

public class TinhThoiGian {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        double start = stopWatch.startTime();
        System.out.println("Start "+ start);
        int sum = 0;
        for (int i = 0; i < 1000; i++){
            sum +=i;
        }
        System.out.println(sum);
        double end = stopWatch.startTime();
        System.out.println("End " + end);
        System.out.println(end - start);
    }
}
class StopWatch{
    private double startTime;

    public double getStartTime() {
        return startTime;
    }

    public double startTime() {
         return this.startTime = System.currentTimeMillis();
    }
}
