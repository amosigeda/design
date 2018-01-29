package com.example.weitechao.designpatten.factory.jiandan;

public class ProductFactory {
	public Product create(String productName) {
		switch (productName) {
		case "A":
			return new ProductA();
		case "B":
			return new ProductB();
		default:
			return null;
		}

	}

}
