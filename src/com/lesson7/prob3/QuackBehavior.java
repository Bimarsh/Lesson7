package com.lesson7.prob3;

public interface QuackBehavior {
	public void quack();

	default void muteQuack() {
		System.out.println("  cannot quack");
	}

	default void canQuack() {
		System.out.println("  quacking");
	}

	default void squeak() {
		System.out.println("  squeaking");
	}
}
