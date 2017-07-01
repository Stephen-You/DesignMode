package com.you.duck.practice;
/**
// * ����ģʽ:�������㷨��,�ֱ��װ����,������֮����Ի����滻,��ģʽ���㷨�ı仯������ʹ���㷨�Ŀͻ�.
 * @author Yorick
 *����֪�����Ƕ�һ����й��Ե����Ժ���Ϊ������ĳ���,���ڲ���ģʽ�����ǽ�һ����Ϊ��װΪ�㷨��,������,��������Ҫ��ͬ����Ϊʱ,ֻ��Ҫ�̳���Ӧ��
 *��Ϊ����
 */
public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	public Duck() {
	}
	
	public abstract void display();
	
	//��ʵ��ί�и���Ϊ��
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
