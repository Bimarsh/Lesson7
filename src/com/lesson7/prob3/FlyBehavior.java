package com.lesson7.prob3;

public interface FlyBehavior {
	public void fly();

	default void flyWithWings() {
		System.out.println("  fly with wings");
	}

	default void CannotFly() {
		System.out.println("  cannot fly");
	}
}
