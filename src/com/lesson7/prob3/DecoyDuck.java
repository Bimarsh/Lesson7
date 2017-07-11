package com.lesson7.prob3;

public class DecoyDuck extends Duck implements FlyBehavior, QuackBehavior {
	public DecoyDuck() {
		/*
		 * setQuackBehavior(new MuteQuack()); setFlyBehavior(new CannotFly());
		 */
	}

	@Override
	public void display() {
		System.out.println("  displaying");

	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		QuackBehavior.super.muteQuack();

	}

	@Override
	public void fly() {
		FlyBehavior.super.CannotFly();
	}
}
