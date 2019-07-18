package com.shobhit.q3;

/**
 * This class contains methods to calculate area of rectangle, square, triangle and circle
 * @author Shobhit
 *
 */
public class Area {


	/**
	 * Calculates area of triangle
	 * @param width passed as a double format number
	 * @param height passed as a double format number
	 * @return returns calculated area of triangle
	 */
	public double triangleArea(double width, double height){

		double area= (double)(0.5 * width * height);

		return area;
	}

	/**
	 * Calculates area of rectangle
	 * @param widthwidth passed as a double format number
	 * @param height passed as a double format number
	 * @return returns calculated area of rectangle
	 */
	public double rectangleArea(double width, double height){
		double area= (width * height);

		return area;
	}

	/**
	 * Calculates area of square
	 * @param widthwidth passed as a double format number
	 * @param height passed as a double format number
	 * @return returns calculated area of square
	 */
	public double squareArea(double width){
		double area= width * width;

		return area;
	}

	/**
	 * Calculates area of circle
	 * @param widthwidth passed as a double format number
	 * @return returns calculated area of circle
	 */
	public double circleArea(double radius){
		double area= 3.14 * radius *radius;

		return area;
	}
}
