package com.you.weather.observer;

public interface Subject {
	//注册为观察者
	public void registerObserver(Observer o);
	//删除观察者身份
	public void removeObserver(Observer o);
	//主题状态发生改变,这个方法会被调用,以通知所有的观察者
	public void notifyObserver();
}
