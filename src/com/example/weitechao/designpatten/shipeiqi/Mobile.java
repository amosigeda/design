package com.example.weitechao.designpatten.shipeiqi;
//首先一部手机：Mobile.java
public class Mobile {
	/*充电
	 * */
	
	public void inputPower(V5Power power){
		int provideV5Power = power.provideV5Power();
		System.out.println("手机客户端：我需要5V电压充电，现在是-->"+provideV5Power+"v");
	}

}
