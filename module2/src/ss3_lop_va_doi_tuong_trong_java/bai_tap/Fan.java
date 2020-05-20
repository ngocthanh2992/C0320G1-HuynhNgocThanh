package ss3_lop_va_doi_tuong_trong_java.bai_tap;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5.0;
    private String colour = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Fan() {
    }
    public String toString(){
        if (isOn()){
            System.out.println("Speed is: "+ getSpeed() + " ,colour is: "+getColour()+ " ,radius is: "+getRadius() + " and fan is on");
        }else {
            System.out.println( "Color is: "+getColour()+" ,radius is: "+getRadius() + " and fan is off");
        }
        return "";
    }
}
