package com.you.weather.observer.api;

public class WeatherDataTest {
	public static void main(String[] args) {
		//����һ���������
		WeatherData weatherData = new WeatherData();
		//��������󴴵ݸ��۲���,
		ConcreteObserver concreteObserver = new ConcreteObserver(weatherData);
		//������վ��ȡ����
		weatherData.setMeasurements(80, 65, 30.4f);
	}
}
