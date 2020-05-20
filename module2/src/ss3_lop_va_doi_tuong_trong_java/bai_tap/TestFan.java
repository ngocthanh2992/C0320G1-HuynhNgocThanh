package ss3_lop_va_doi_tuong_trong_java.bai_tap;

public class TestFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColour("yellow");
        fan1.setOn(true);
        fan1.toString();
        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColour("blue");
        fan2.setOn(false);
        fan2.toString();
    }
}
