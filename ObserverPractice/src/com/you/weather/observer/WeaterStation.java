package com.you.weather.observer;

public class WeaterStation {

	public static void main(String[] args) {
		//建立一个主题对象
		WeatherData weatherData = new WeatherData();
		//建立一个布告板对象,传递主题对象给他们
		ConcreteObserver concreteObserver = new ConcreteObserver(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
	}

}
