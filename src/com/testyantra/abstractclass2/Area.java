package com.testyantra.abstractclass2;

public class Area extends Shape {

	@Override
	double ReactangleArea(double length, double breath) {
		return length*breath;
	}

	@Override
	double SquareArea(double side) {
		return side*side;
	}

	@Override
	double CircleArea(double radius) {
		return 3.14*radius*radius;
	}

}



