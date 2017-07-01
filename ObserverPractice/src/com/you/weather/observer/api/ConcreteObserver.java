package com.you.weather.observer.api;

import java.util.Observable;
import java.util.Observer;

import com.you.weather.observer.DisplayElement;
/**
 * 比较第一种方式和第二种方式的不同点:
 * 	第一种方式是通过实现接口,然后实现方法,来将状态通知给观察者的,这种通知,会将所有的状态都传递给观察者,
 * 		而且这种通知是在主题中状态发生变化的时候就通知,可能某个观察者此时并不需要这种通知,三,当观察者想要获取状态时,只能是主题状态发生改变
 * 		然后主动通知观察者,观察者不能主动获取到状态.update方法是将状态作为参数创递给观察者
 * 	第二种方式是通过继承类的方式来实现的,所有的注册,销毁等方法都是在父类中的,我们不用再自己定义,但是我们知道Java编程原则是多组合,少继承,继承了这个类的时候
 * 		我们就不能再去继承其他类了,减少了代码的复用性.这种方式中,update方法是将主题实例和由状态封装成的对象传递给观察者的,观察者也可以通过主题提供的get方法主动获取状态
 * 一般情况下我们还是建议使用第一种方式
 * @author Yorick
 *
 */
public class ConcreteObserver implements Observer,DisplayElement{
	private float temperature;
	private float humidiry;
	//用来和主题绑定连接,用于注册和取消
	private Observable observable;
	//注册为观察者
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
		//继承接口中的update方法,Java 中的instanceof 运算符是用来在运行时指出对象是否是特定类的一个实例
		if(o instanceof WeatherData){
			WeatherData weatherData = (WeatherData) o;
			//通过拉的方式获取主题中自己所需的状态
			this.temperature = weatherData.getTemperature();
			this.humidiry = weatherData.getHumidiry();
			display();
		}
	}

}
