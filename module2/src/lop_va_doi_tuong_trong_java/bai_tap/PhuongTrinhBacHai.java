package lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;

class QuadraticEquation {
    private double a,b,c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant(){
       return b*b - (4*(a*c));
    }

    public double getRoot1(){
        return (-b+Math.sqrt(this.getDiscriminant()))/(2*a);
    }
    public double getRoot2(){
        return (-b-Math.pow(this.getDiscriminant(),0.5))/(2*a);
        }
    public void display(){
        System.out.println( "a "+ this.getA() + " b "+ this.getB()+ " c "+ this.getC());
    }
}
public class PhuongTrinhBacHai{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter c: ");
        double c = Double.parseDouble(scanner.nextLine());

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        quadraticEquation.display();
        System.out.println("Delta = "+ quadraticEquation.getDiscriminant());
        if (quadraticEquation.getDiscriminant() > 0){
            System.out.println("Nghiệm 1:" +quadraticEquation.getRoot1()+ " nghiệm 2: "+quadraticEquation.getRoot2());
        }else if (quadraticEquation.getDiscriminant() == 0){
            System.out.println("Nghiệm là: "+quadraticEquation.getRoot1());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}


