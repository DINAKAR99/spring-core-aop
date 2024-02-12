package cgg.springcore.aop;

public class Circle {
    private int radius;

    public int getRadius() {
        System.out.println("in get radius");
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

}
