package com.example.weitechao.designpatten.moban;

public class ManagerWorker extends Worker{

	public ManagerWorker(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		System.out.println(name+"打dota");
	}

}
