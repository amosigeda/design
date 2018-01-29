package com.example.weitechao.designpatten.factory.chouxiang;



public class Client {
	public static void main(String[] args) {
		AbstractFactory abf=new Factory1();
		ProductAI aI = abf.createProductA();
		aI.productName();
		
	}
	

}
