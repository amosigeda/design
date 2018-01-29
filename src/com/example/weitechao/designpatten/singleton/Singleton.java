package com.example.weitechao.designpatten.singleton;

//单例模式的恶汉式
public class Singleton {
	private static Singleton instance=new Singleton();
	private Singleton(){
		
	}
	public static Singleton getInstance(){
		return instance;
	}
	
	/*访问方式
	 * Singleton instance = Singleton.getInstance();
	 * */
	
	/*优点：从它的实现中我们可以看到，这种方式的实现比较简单，在类加载的时候就完成了实例化，避免了线程的同步问题。

缺点：由于在类加载的时候就实例化了，所以没有达到Lazy Loading(懒加载)的效果，也就是说可能我没有用到这个实例，但是它

也会加载，会造成内存的浪费(但是这个浪费可以忽略，所以这种方式也是推荐使用的)。*/

}
