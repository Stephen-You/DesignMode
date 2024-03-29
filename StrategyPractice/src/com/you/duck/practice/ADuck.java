package com.you.duck.practice;
/**
 * 不同的鸭子有不同的特性,比如有的会叫,有的不会叫,有的会飞,有的飞不高,想这些具有共同行为,但却又有不同实现的我们
 * 可以利用策略模式,将这些行为封装成算法族,然后各自继承自己特有的算法
 * @author Yorick
 */
public class ADuck extends Duck{

	@Override
	public void display() {
		System.out.println("ADuck!");
	}
	public static void main(String[] args) {
		Duck duck = new ADuck();
		//可以动态改变行为
		duck.flyBehavior = new FlyWithWings();
		duck.testFly();
		duck.display();
	}
}
