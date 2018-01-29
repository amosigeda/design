package com.example.weitechao.designpatten.observer;

public class Observer2 implements Observer {

	private Subject subject;

	public Observer2(Subject subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}

	public void update(String msg) {
		System.out.println("observer2得到 3D 号码  -->" + msg + ", 我要告诉舍友。");
	}

}
