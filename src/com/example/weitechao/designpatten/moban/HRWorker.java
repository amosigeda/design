package com.example.weitechao.designpatten.moban;

public class HRWorker extends Worker{

	public HRWorker(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		System.out.println(name+"看简历-打电话-接电话");
	}

}
