package com.you.weather.observer;

public interface Subject {
	//ע��Ϊ�۲���
	public void registerObserver(Observer o);
	//ɾ���۲������
	public void removeObserver(Observer o);
	//����״̬�����ı�,��������ᱻ����,��֪ͨ���еĹ۲���
	public void notifyObserver();
}
