package com.example.weitechao.designpatten.moban;

import java.util.Date;

/*
 * 模板方法模式
 * 
 * 超类
 * */
public abstract class Worker {
	protected String name;

	public Worker(String name) {
		this.name = name;
	}

	/*
	 * 记录一天的工作
	 */
	public final void workOneDay() {
		System.out.println("start wokr..");
		eneterCompany();
		computerOn();
		work();
		computerOff();
		exitCompany();
		System.out.println("work---end--");
	}

	/**
	 * 工作
	 */
	public abstract void work();

	private void exitCompany() {
		if (isNeedPrintDate()) {
			System.out.print(new Date() + "-->");
		}
		System.out.println(name + "离开公司");
	}
/*
 * 模版方式里面也可以可选的设置钩子，比如现在希望记录程序员离开公司的时间，我们就可以在超类中添加一个钩子
 * */
	private boolean isNeedPrintDate() {
		
		return true;
	}

	private void computerOff() {
		System.out.println(name + "关闭电脑");
	}

	private void computerOn() {
		System.out.println(name + "打开电脑");
	}

	private void eneterCompany() {
		System.out.println(name + "进入公司");
	}

}
