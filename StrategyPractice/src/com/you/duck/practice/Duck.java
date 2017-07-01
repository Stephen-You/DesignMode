package com.you.duck.practice;
/**
// * 策略模式:定义了算法族,分别封装起来,让他们之间可以互相替换,此模式让算法的变化独立于使用算法的客户.
 * @author Yorick
 *我们知道类是对一类具有共性的属性和行为的事物的抽象,而在策略模式中我们将一类行为封装为算法族,来处理,这样当需要不同的行为时,只需要继承相应的
 *行为即可
 */
public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	public Duck() {
	}
	
	public abstract void display();
	
	//把实现委托给行为类
	public void testFly(){
		flyBehavior.fly();
	}
	
	public void testQuack(){
		quackBehavior.quack();
	}
	
	public void swim(){
		System.out.println("All duck can swimming!");
	}
	
}
