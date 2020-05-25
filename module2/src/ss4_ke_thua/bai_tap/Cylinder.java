package ss4_ke_thua.bai_tap;

public class Cylinder extends Circle{
    private float height;

    public Cylinder() {
    }

    public Cylinder(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public float setHeight(float height) {
        return this.height = height;
    }
    @Override
    public double getArea(){
        return 2*Math.PI*this.getRadius()*this.getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                super.toString()+
                "height=" + height +
                '}';
    }

}
