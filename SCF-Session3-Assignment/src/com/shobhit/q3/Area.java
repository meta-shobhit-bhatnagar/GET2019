package com.shobhit.q3;

public class Area {



    public double triangleArea(double width, double height){
        double area= (double)(0.5 * width * height);

        return area;
    }

    public double rectangleArea(double width, double height){
        double area= (width * height);

        return area;
    }

    public double squareArea(double width){
        double area= width * width;

        return area;
    }


    public double circleArea(double radius){
        double area= 3.14 * radius *radius;

        return area;
    }
}
