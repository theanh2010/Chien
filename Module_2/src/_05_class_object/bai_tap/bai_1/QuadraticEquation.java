package _05_class_object.bai_tap.bai_1;

import java.util.Scanner;

public class QuadraticEquation {
    double a,b,c;

    public QuadraticEquation(double a,double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return this.a;
    }
    public double getB() {
        return this.b;
    }
    public double getC() {
        return this.c;
    }
    public double getDiscriminant(double a, double b, double c) {
        double delta = this.b*this.b - 4*this.a*this.c ;
        return delta ;
    }
//    public double getRoot1(double a, double b, double c){
//        double r1 = (-b + Math.sqrt(getDiscriminant()))
//    }
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Nhập a: ");
    double a = input.nextDouble() ;
    System.out.println("Nhập b: ");
    double b = input.nextDouble() ;
    System.out.println("Nhập c: ");
    double c = input.nextDouble() ;

    QuadraticEquation quadraticEquation = new QuadraticEquation(a , b, c) ;
    System.out.println(quadraticEquation.getDiscriminant(a,b,c));
}
}
