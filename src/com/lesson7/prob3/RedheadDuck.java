package com.lesson7.prob3;

public class RedheadDuck extends Duck implements FlyBehavior, QuackBehavior {
	public RedheadDuck() {
		// setQuackBehavior(new Quack());
		// setFlyBehavior(new FlyWithWings());
	}

	@Override
	public void display() {
		System.out.println("  displaying");

	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		flyWithWings();
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		canQuack();

	}
}
