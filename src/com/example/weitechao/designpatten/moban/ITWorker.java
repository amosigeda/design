package com.example.weitechao.designpatten.moban;

public class ITWorker extends Worker {

	public ITWorker(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		System.out.println(name + "写程序-测bug-fix bug");
	}

	public boolean isNeedPrintDate() {
		return false;
	}
}
