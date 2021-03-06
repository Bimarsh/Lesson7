package com.lesson7.prob2;

public interface Polygon extends ClosedCurve {

	double[] getSides();

	default double computePerimeter(double[] getSides) {
		double returnValue = 0;
		for (int i = 0; i < getSides.length; i++) {
			returnValue += getSides[i];
		}
		return returnValue;

	}

}
