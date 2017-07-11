package com.lesson7.prob3;

public class MallardDuck extends Duck implements FlyBehavior, QuackBehavior {
	public MallardDuck() {
		// setQuackBehavior(new Quack());
		// setFlyBehavior(new FlyWithWings());
	}

	@Override
	public void display() {
		System.out.println("  display");

	}

	@Override
	public void fly() {
		// TODO Auto-generated method stu
		flyWithWings();

	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		canQuack();

	}

}
