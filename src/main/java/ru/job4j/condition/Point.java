package ru.job4j.condition;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    public double distance3d(Point that) {
        return Math.sqrt(Math.pow(that.x - this.x, 2) + Math.pow(that.y - this.y, 2) + Math.pow(that.z - this.z, 2));
    }

    public double distance(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double result = a.distance(b);
        System.out.println("result (0, 0) to (2, 0) " + result);
        a = new Point(0, 4);
        b = new Point(2, 0);
        result = a.distance(b);
        System.out.println("result (0, 4) to (2, 0) " + result);
        a = new Point(3, 2);
        b = new Point(1, 0);
        result = a.distance(b);
        System.out.println("result (3, 2) to (1, 0) " + result);
    }
}
