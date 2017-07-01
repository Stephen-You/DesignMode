package com.you.weather.observer.api;

import java.util.ArrayList;
import java.util.Observable;

import com.you.weather.observer.Observer;
import com.you.weather.observer.Subject;
/**
 * 观察者模式:定义了对象之间的一对多依赖,这样一来当一个对象改变状态时,他的所有依赖者都会收到通知并自动更新
 * 观察者模式的实现方式有推和拉两种,但一般我们多使用推(Subject Observer),看过了第一种自定义的观察者模式,下面我们来看一下内置API提供的观察者模式
 * 内置API提供的观察者模式通过继承类Observable和实现接口Observer来实现,下面我们来看一下
 * @author Yorick
 */
public class WeatherData extends Observable{
	//定义三个变量作为天气数据
	private float temperature;
	private float humidiry;
	private float pressure;
	//在通过内置API实现观察者模式的时候我们不需要再在构造函数中定义集合去记录观察者了
	public WeatherData(){
	}
	//从气象站获取数据
	public void setMeasurements(float temperatur,float humidiry,float pressure){
		this.temperature = temperatur;
		this.humidiry = humidiry;
		this.pressure = pressure;
		//数据变化通知观察者
		measurements();
	}
	//WeatherData自己的行为,当成气象站获取到数据时,通知观察者
	public void measurements(){
		setChanged();
		notifyObservers();
	}
	//提供获取数据的方法,供观察者通过拉的方式获取
	public float getTemperature() {
		return temperature;
	}
	public float getHumidiry() {
		return humidiry;
	}
	public float getPressure() {
		return pressure;
	}
	
	
	
	
	
	
}
