package ss4_ke_thua.bai_tap;

public class Test {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(2);
        cylinder.setHeight(10);
        System.out.println(cylinder);

        Point2D point2d = new Point2D();
        System.out.println(point2d);
        point2d = new Point2D(10, 15);
        System.out.println(point2d);

        Point3D point3d = new Point3D();
        System.out.println(point3d);
        point3d = new Point3D(2, 5, 4);
        System.out.println(point3d);
    }
}
