package _06_ke_thua.bai_tap.circle_and_cylindr;

public class Circle {
    private double radius;
    private String color ;
    public Circle(){}

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color ;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return  this.radius*Math.PI ;
    }

    @Override
    public String toString() {
        return "Circle có bán kính: "
                + getRadius()
                + "\n Diện tích: "
                + getArea()
                + "\n màu: "+
                getColor()
                ;
    }
}