package com.you.weather.observer;

public class WeaterStation {

	public static void main(String[] args) {
		//����һ���������
		WeatherData weatherData = new WeatherData();
		//����һ����������,����������������
		ConcreteObserver concreteObserver = new ConcreteObserver(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
	}

}
