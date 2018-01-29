package com.example.weitechao.designpatten.singleton;

//单例模式的饿汉式变换写法
public class Singleton1 {
	private static Singleton1 instance = null;
	
	static {
		instance = new Singleton1();
	}
	
	private Singleton1(){
		
	}
	
	public static Singleton1 getInstance(){
		return instance;
		
	}

}
