package com.example.weitechao.designpatten.factory.chouxiang;

public class Factory2 implements AbstractFactory{

	@Override
	public ProductAI createProductA() {
		return new ProductA2();
	}

	@Override
	public ProductBI createProductB() {
		return new ProductB2();
	}

}
