package ss5_advanced_object_oriented_design.thuc_hanh;

import ss4_ke_thua.thuc_hanh.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }
}
