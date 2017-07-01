package com.you.weather.observer.api;

import java.util.ArrayList;
import java.util.Observable;

import com.you.weather.observer.Observer;
import com.you.weather.observer.Subject;
/**
 * �۲���ģʽ:�����˶���֮���һ�Զ�����,����һ����һ������ı�״̬ʱ,�������������߶����յ�֪ͨ���Զ�����
 * �۲���ģʽ��ʵ�ַ�ʽ���ƺ�������,��һ�����Ƕ�ʹ����(Subject Observer),�����˵�һ���Զ���Ĺ۲���ģʽ,������������һ������API�ṩ�Ĺ۲���ģʽ
 * ����API�ṩ�Ĺ۲���ģʽͨ���̳���Observable��ʵ�ֽӿ�Observer��ʵ��,������������һ��
 * @author Yorick
 */
public class WeatherData extends Observable{
	//��������������Ϊ��������
	private float temperature;
	private float humidiry;
	private float pressure;
	//��ͨ������APIʵ�ֹ۲���ģʽ��ʱ�����ǲ���Ҫ���ڹ��캯���ж��弯��ȥ��¼�۲�����
	public WeatherData(){
	}
	//������վ��ȡ����
	public void setMeasurements(float temperatur,float humidiry,float pressure){
		this.temperature = temperatur;
		this.humidiry = humidiry;
		this.pressure = pressure;
		//���ݱ仯֪ͨ�۲���
		measurements();
	}
	//WeatherData�Լ�����Ϊ,��������վ��ȡ������ʱ,֪ͨ�۲���
	public void measurements(){
		setChanged();
		notifyObservers();
	}
	//�ṩ��ȡ���ݵķ���,���۲���ͨ�����ķ�ʽ��ȡ
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
