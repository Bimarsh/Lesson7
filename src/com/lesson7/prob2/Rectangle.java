package com.lesson7.prob2;

public class Rectangle implements Polygon {
	private double length, width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double[] getSides() {
		// TODO Auto-generated method stub
		double[] a = { this.length, this.width, this.length, this.width };
		return a;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return Polygon.super.computePerimeter(getSides());
	}

}
