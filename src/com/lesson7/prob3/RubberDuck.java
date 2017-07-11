package com.lesson7.prob3;

public class RubberDuck extends Duck implements FlyBehavior, QuackBehavior {
	public RubberDuck() {
		// setQuackBehavior(new Squeak());
		// setFlyBehavior(new CannotFly());
	}

	@Override
	public void display() {
		System.out.println("  displaying");

	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		squeak();
	}

	@Override
	public void fly() {
		// TODO Auto-genegetFlyBehavior().CannotFly();
		CannotFly();
	}
}
