package com.example.weitechao.designpatten.factory.gongchang;

import com.example.weitechao.designpatten.factory.jiandan.Product;
/*
 * */
public class Client {
	public static void main(String[] args) {
		Factory factoryA=new FactoryA();
		Product ProductA = factoryA.create();
		ProductA.productName();
		
		Factory factoryB=new FactoryB();
		Product ProductB = factoryB.create();
		ProductB.productName();
	}

}
