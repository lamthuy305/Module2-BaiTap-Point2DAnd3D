package com.codegym;

public class Main {

    public static void main(String[] args) {
	Point2D point2D = new Point2D(5, 10);
        System.out.println(point2D);
        float [] arr = point2D.getXY();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    Point3D point3D = new Point3D(5,10,15);
        System.out.println(point3D);
    }
}
