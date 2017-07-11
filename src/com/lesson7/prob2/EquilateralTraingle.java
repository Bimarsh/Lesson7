package com.lesson7.prob2;

public class EquilateralTraingle implements Polygon {

	private double side;

	public EquilateralTraingle(double side) {
		// TODO Auto-generated constructor stub
		this.side = side;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return Polygon.super.computePerimeter(getSides());
	}

	@Override
	public double[] getSides() {
		// TODO Auto-generated method stub
		double[] sides = { this.side, this.side, this.side };
		return sides;
	}
}
