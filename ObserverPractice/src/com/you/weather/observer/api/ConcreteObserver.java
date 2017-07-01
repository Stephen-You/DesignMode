package com.you.weather.observer.api;

import java.util.Observable;
import java.util.Observer;

import com.you.weather.observer.DisplayElement;
/**
 * �Ƚϵ�һ�ַ�ʽ�͵ڶ��ַ�ʽ�Ĳ�ͬ��:
 * 	��һ�ַ�ʽ��ͨ��ʵ�ֽӿ�,Ȼ��ʵ�ַ���,����״̬֪ͨ���۲��ߵ�,����֪ͨ,�Ὣ���е�״̬�����ݸ��۲���,
 * 		��������֪ͨ����������״̬�����仯��ʱ���֪ͨ,����ĳ���۲��ߴ�ʱ������Ҫ����֪ͨ,��,���۲�����Ҫ��ȡ״̬ʱ,ֻ��������״̬�����ı�
 * 		Ȼ������֪ͨ�۲���,�۲��߲���������ȡ��״̬.update�����ǽ�״̬��Ϊ�������ݸ��۲���
 * 	�ڶ��ַ�ʽ��ͨ���̳���ķ�ʽ��ʵ�ֵ�,���е�ע��,���ٵȷ��������ڸ����е�,���ǲ������Լ�����,��������֪��Java���ԭ���Ƕ����,�ټ̳�,�̳���������ʱ��
 * 		���ǾͲ�����ȥ�̳���������,�����˴���ĸ�����.���ַ�ʽ��,update�����ǽ�����ʵ������״̬��װ�ɵĶ��󴫵ݸ��۲��ߵ�,�۲���Ҳ����ͨ�������ṩ��get����������ȡ״̬
 * һ����������ǻ��ǽ���ʹ�õ�һ�ַ�ʽ
 * @author Yorick
 *
 */
public class ConcreteObserver implements Observer,DisplayElement{
	private float temperature;
	private float humidiry;
	//���������������,����ע���ȡ��
	private Observable observable;
	//ע��Ϊ�۲���
	public ConcreteObserver(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("temperature:"+temperature+"  "+"humidiry:"+humidiry);
		
	}

	@Override
	public void update(Observable o, Object arg) {
		//�̳нӿ��е�update����,Java �е�instanceof �����������������ʱָ�������Ƿ����ض����һ��ʵ��
		if(o instanceof WeatherData){
			WeatherData weatherData = (WeatherData) o;
			//ͨ�����ķ�ʽ��ȡ�������Լ������״̬
			this.temperature = weatherData.getTemperature();
			this.humidiry = weatherData.getHumidiry();
			display();
		}
	}

}
