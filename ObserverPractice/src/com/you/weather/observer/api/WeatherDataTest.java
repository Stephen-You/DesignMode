package com.you.weather.observer.api;

public class WeatherDataTest {
	public static void main(String[] args) {
		//创建一个主题对象
		WeatherData weatherData = new WeatherData();
		//将主题对象创递给观察者,
		ConcreteObserver concreteObserver = new ConcreteObserver(weatherData);
		//从气象站获取数据
		weatherData.setMeasurements(80, 65, 30.4f);
	}
}
