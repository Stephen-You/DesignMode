package com.you.duck.practice;

public class BDuck extends Duck{

	@Override
	public void display() {
		System.out.println("BDuck!");
	}
	public static void main(String[] args) {
		Duck duck = new BDuck();
		duck.quackBehavior = new Quack();
		duck.testQuack();;
		duck.display();
	}
}
