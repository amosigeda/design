package com.example.weitechao.designpatten.singleton;

/*单例模式懒汉式双重校验锁[推荐用]*/
public class Singleton3 {
	/*
	 * 懒汉式变种，属于懒汉式中最好的写法，保证了:延迟加载和线程安全
	 */
	private static Singleton3 instance = null;

	private Singleton3() {
	}
	public static Singleton3 getInstance() {
		if (instance == null)
			synchronized (Singleton2.class) {
				if (instance == null) {
					instance = new Singleton3();
				}

			}
		return instance;
	}
	/*优点：线程安全；延迟加载；效率较高。*/

}
