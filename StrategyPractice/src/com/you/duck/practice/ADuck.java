package com.you.duck.practice;
/**
 * ��ͬ��Ѽ���в�ͬ������,�����еĻ��,�еĲ����,�еĻ��,�еķɲ���,����Щ���й�ͬ��Ϊ,��ȴ���в�ͬʵ�ֵ�����
 * �������ò���ģʽ,����Щ��Ϊ��װ���㷨��,Ȼ����Լ̳��Լ����е��㷨
 * @author Yorick
 */
public class ADuck extends Duck{

	@Override
	public void display() {
		System.out.println("ADuck!");
	}
	public static void main(String[] args) {
		Duck duck = new ADuck();
		//���Զ�̬�ı���Ϊ
		duck.flyBehavior = new FlyWithWings();
		duck.testFly();
		duck.display();
	}
}